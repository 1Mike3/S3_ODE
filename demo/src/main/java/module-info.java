module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens E5_networking.GUI to javafx.fxml;
    exports E5_networking.GUI;
}