package com.example.studentmenagmentapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class App extends Application {
    public void start(Stage primaryStage) {
        try {
            URL fxmlUrl = getClass().getResource("/studentfxml.fxml");

            System.out.println("FXML file location: " + fxmlUrl);

            if (fxmlUrl == null) {
                throw new RuntimeException("FXML file not found!");
            }

            FXMLLoader fxmlLoader = new FXMLLoader(fxmlUrl);
            Scene scene = new Scene(fxmlLoader.load());
            primaryStage.setTitle("Menaxhimi i Studentëve");
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
