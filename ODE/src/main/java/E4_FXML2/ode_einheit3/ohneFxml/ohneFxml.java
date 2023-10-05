package E4_FXML2.ode_einheit3.ohneFxml;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ohneFxml extends Application {
    TextArea txt_log = new TextArea();
    @Override
    public void start(Stage primaryStage) throws Exception{
        ObservableList<String> pokedex =
                FXCollections.observableArrayList();

        //Set Window Size
        primaryStage.setMinWidth(500);
        primaryStage.setMinHeight(300);

        VBox topvbox = new VBox();
        topvbox.setPadding(new Insets(10));
        topvbox.setSpacing(10);
        BorderPane borderpoane = new BorderPane();
        VBox vbox = new VBox();
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(0,10,0,0));

        ListView<String> list_pokedex = new ListView<>();

        //text Fields
        TextField txt_name = new TextField();
        txt_name.setPromptText("Name");
        TextField txt_level = new TextField();
        txt_level.setPromptText("Level");
        TextField txt_healthPoints = new TextField();
        txt_healthPoints.setPromptText("Health Points");
        TextField txt_exp = new TextField();
        txt_exp.setPromptText("Experience");

        //Buttons
        Button btn_add = new Button("Add");
        btn_add.setPrefWidth(200);
        Button btn_remove = new Button("Remove");
        btn_remove.setPrefWidth(200);
        Button btn_clear = new Button("clear");
        btn_clear.setPrefWidth(200);
        list_pokedex.setItems(pokedex);
        //Button Actions
        btn_add.setOnAction(e -> {

            String name = txt_name.getText();

            int level;
            int exp;
            int hp;
            try {
               level  =  Integer.parseInt(txt_level.getText());
                exp = Integer.parseInt(txt_exp.getText());
                hp = Integer.parseInt(txt_healthPoints.getText());
            } catch (NumberFormatException ex) {
                log("Well that wasn't a number  :( ");
                return;
            }

            log("Pokemon added");

            Pokemon p = new Pokemon(name, level, hp, exp);
            pokedex.add(p.toString());
        });

        btn_remove.setOnAction(e -> {
            log("How dare you killed a pokemon!");
            pokedex.remove(list_pokedex.getSelectionModel().getSelectedItem());
        });

        btn_clear.setOnAction(e -> {
            log("Where ze Pokimons go?");
            pokedex.clear();
        });


        topvbox.getChildren().addAll(txt_log, borderpoane);
        borderpoane.setLeft(vbox);
        borderpoane.setCenter(list_pokedex);

        vbox.getChildren().addAll(txt_name, txt_level, txt_healthPoints, txt_exp, btn_add,
                btn_remove, btn_clear);

        Scene scene = new Scene(topvbox, 300, 275);
        primaryStage.setTitle("Pokedex");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void log (String s){
        txt_log.appendText(s + "\n");
    }
    public static void main(String[] args) {
        launch(args);
    }
}

class Pokemon{
    String name;
    int level;

    int healthPoints;

    int exp;
    public Pokemon(String n, int l, int hp, int exp) {
        this.name = n;
        this.level = l;
        this.healthPoints = hp;
        this.exp = exp;
    }
    @Override
    public String toString() {
        return "Pokemon{" +
                "n='" + name + '\'' +
                ", x='" + exp + '\'' +
                ", hp='" + healthPoints + '\'' +
                ", l=" + level +
                '}';
    }
}