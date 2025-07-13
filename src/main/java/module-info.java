module com.example.studentmenagmentapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.studentmenagmentapp to javafx.fxml;
    exports com.example.studentmenagmentapp;
    opens com.example.studentmenagmentapp.Controllers to javafx.fxml;

    //exports com.example.studentmenagmentapp;
    exports com.example.studentmenagmentapp.Controllers;
}