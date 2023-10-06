package E5_networking.GUI;

import E5_networking.Client.TCP_Client;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ClientController {

    // Buttons
    @FXML
    Button btn_setPort;
    @FXML
    Button btn_startClient;
    @FXML
    Button btn_stopClient;
    @FXML
    Button btn_send;

    // Test
    @FXML
    TextField txt_setPort;
    @FXML
    TextField txt_currentPort;
    @FXML
    TextField txt_clientState;
    @FXML
    TextField txt_sendText;





    // Button Actions
    public void onAction_btn_setPort() {
        try {
            int number = Integer.parseInt(txt_setPort.getText());
            txt_currentPort.setText(String.valueOf(number));
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }

        txt_setPort.setText("");
        txt_setPort.setPromptText("Port set");
    }
    public void onAction_btn_startClient() {
    	txt_clientState.setText("Client started");
        try {
            TCP_Client.main(null);
        }
        catch(Exception e){
            System.out.println("Sum Ting Wong");
            System.out.println("Fehler beim Erzeugen des ServerSockets: " + e.getMessage());
        }
    }
    public void onAction_btn_stopClient() {
    	txt_clientState.setText("Client stopped");
    }
    public void onAction_btn_send() {
    	txt_clientState.setText("Client sent: " + txt_sendText.getText());
    }


@FXML
    public void initialize() {

    }

}


