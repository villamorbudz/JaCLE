package com.example.capstoneapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainUIApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader createQuiz = new FXMLLoader(MainUIApplication.class.getResource("CreateQuiz.fxml"));
        Scene scene = new Scene(createQuiz.load(), 800, 600);
        stage.setTitle("JaCLE | Java Cards for Learning Excellence");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}