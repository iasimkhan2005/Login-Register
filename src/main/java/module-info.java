module com.example.lab13practice {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.sql;

    opens com.example.lab13practice to javafx.fxml;
    exports com.example.lab13practice;
}