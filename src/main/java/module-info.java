module com.example.try_mess {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.try_mess to javafx.fxml;
    exports com.example.try_mess;
}