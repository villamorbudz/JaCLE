package com.example.capstoneapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class AnswerQuizController {

    @FXML
    private AnchorPane AnswerQuizCard;

    @FXML
    private Pane MCQCardContainer;

    @FXML
    private ToggleGroup MCQChoices;

    @FXML
    private Pane choice1Container;

    @FXML
    private RadioButton choice1RadioButton;

    @FXML
    private Pane choice2Container;

    @FXML
    private RadioButton choice2RadioButton;

    @FXML
    private Pane choice3Container;

    @FXML
    private RadioButton choice3RadioButton;

    @FXML
    private Pane choice4Container;

    @FXML
    private RadioButton choice4RadioButton;

    @FXML
    private Pane choicesContainer;

    @FXML
    private Button exitQuizButton;

    @FXML
    private Button nextQuestionButton;

    @FXML
    private Button previousQuestionButton;

    @FXML
    private Label questionLabel;

    @FXML
    private Button submitButton;

}
