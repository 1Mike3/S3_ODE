module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.testng;
    requires org.junit.jupiter.api;



    opens E5_networking.GUI to javafx.fxml;
    exports E5_networking.GUI;
}