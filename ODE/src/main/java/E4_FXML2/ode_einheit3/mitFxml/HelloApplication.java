package E4_FXML2.ode_einheit3.mitFxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class HelloApplication extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception{


          //  Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/home/student/IdeaProjects/_3_ODE_UE4_EnterName/src/main/java/at/fhtw/ode_einheit3/mitFxml/hello-view.fxml")));
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
            Parent root = fxmlLoader.load();



            primaryStage.setTitle("pokedex");
            primaryStage.setScene(new Scene(root, 800, 600));
            primaryStage.show();





    }
    public static void main(String[] args) {
        launch(args);
    }

    static class Pokemon{
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

}