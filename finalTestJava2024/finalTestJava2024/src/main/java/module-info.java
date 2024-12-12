module com.example.finaltestjava2024 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires java.sql;


    opens com.example.finaltestjava2024 to javafx.fxml, com.google.gson;
    exports com.example.finaltestjava2024;
}