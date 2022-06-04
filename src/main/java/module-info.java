module com.example.heroes2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.heroes2 to javafx.fxml;
    exports com.example.heroes2;
}