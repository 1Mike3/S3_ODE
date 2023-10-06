package E5_networking.GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ClientApplication extends Application {





    @Override
    public void start(Stage primaryStage) throws Exception {
try {
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("E5_networking.fxml"));
    Parent root=fxmlLoader.load();

    primaryStage.setTitle("TCP Server");
    primaryStage.setScene(new Scene(root,800,600));
    primaryStage.show();


} catch (NullPointerException e) {
    System.out.println("Error: " + e.getMessage());
}




    }

    public static void main(String[] args) {
        launch(args);
    }


}
