package E5_networking.GUI;

import E5_networking.Client.TCP_Client;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import SantasLittleHelper.Helpers;

public class ClientController {


    // Shared
    private int portNumber;
    public static String messageFromServer;


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
    @FXML
    TextField txt_messagesFromServer;




    // Button Actions
    public void onAction_btn_setPort() {
        if(Helpers.DEBUG)
            System.out.println("Method onAction_btn_setPort() called");

        try {
            int number = Integer.parseInt(txt_setPort.getText());
            txt_currentPort.setText(String.valueOf(number));
            portNumber = number;
        } catch (NumberFormatException e) {
            System.out.println("Error action set port (client): " + e.getMessage());
        }

        txt_setPort.setText("");
        txt_setPort.setPromptText("Port set");
    }
    public void onAction_btn_startClient() {
        if(Helpers.DEBUG)
            System.out.println("Method onAction_btn_startClient() called");
    	txt_clientState.setText("Client started");
        try {
            TCP_Client.clientRuntime( portNumber);
        }
        catch(Exception e){
            System.out.println("Sum Ting Wong (client)");
            System.out.println("Fehler beim Erzeugen des ServerSockets (client):  " + e.getMessage());
        }
    }
    public void onAction_btn_stopClient() {
        if(Helpers.DEBUG)
            System.out.println("Method onAction_btn_stopClient() called");

    	txt_clientState.setText("Client stopped");


    }
    public void onAction_btn_send() {
        if(Helpers.DEBUG)
            System.out.println("Method onAction_btn_send() called");
        try {
            TCP_Client.sendToServer(txt_sendText.getText());

            TCP_Client.clientRuntime(portNumber);

        } catch (Exception e) {
            System.out.println("Error while sending message to server (client): " + e.getMessage());
        }

    	txt_clientState.setText("Client sent: " + txt_sendText.getText());
        txt_messagesFromServer.setText(messageFromServer);
    }

    // Misc Methods
public static void setTxt_messagesFromServer(String message){
    messageFromServer = message;
}

    // Initialize

@FXML
    public void initialize() {

    }

}


