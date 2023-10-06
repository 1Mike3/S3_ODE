package E4_FXML2.ode_einheit3.mitFxml;

// import pokemon class


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Button btn_add;

    @FXML
    private Button btn_remove;

    @FXML
    private TextArea txt_area;

    @FXML
    private TextField txt_level;

    @FXML
    private TextField txt_log;

    @FXML
    private TextField txt_name;



    EventHandler<ActionEvent> eventHandler = new
            EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent actionEvent) {
// do stuff
                }
            };

    public void initialize() {

        // Button Funcitons
        btn_remove.setOnAction(event -> {
           txt_log.setPromptText("btn_remove clicked");
           txt_area.clear();
        });
        btn_add.setOnAction(event -> {
            txt_log.setPromptText("btn_add clicked");
            HelloApplication.Pokemon p =
                    new HelloApplication.Pokemon(txt_name.getText(), Integer.parseInt(txt_level.getText()), 100, 1);
            txt_area.appendText(p.toString() + "\n");

        });
    }



}
