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
        Scene createQuizScene = new Scene(createQuiz.load(), 1024, 768);
        stage.setTitle("JaCLE | Java Cards for Learning Excellence");
        stage.setScene(createQuizScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}