module com.example.studentmenagmentapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.studentmenagmentapp to javafx.fxml;
    exports com.example.studentmenagmentapp;
}