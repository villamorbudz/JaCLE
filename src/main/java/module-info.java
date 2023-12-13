module com.example.capstoneapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.capstoneapp to javafx.fxml;
    exports com.example.capstoneapp;
}