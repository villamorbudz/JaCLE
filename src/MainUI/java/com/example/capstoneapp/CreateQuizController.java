package com.example.capstoneapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class CreateQuizController {

    @FXML
    private BorderPane CreateQuizContainer;

    @FXML
    private Button addQuestionButton;

    @FXML
    private AnchorPane addQuestionButtonPane;

    @FXML
    private AnchorPane createQuizContainer;

    @FXML
    private AnchorPane createQuizMainPane;

    @FXML
    private ScrollPane createQuizScrollPane;

    @FXML
    private Pane headerBar;

    @FXML
    private RadioButton identificationRadioButton;

    @FXML
    private RadioButton multipleChoiceRadioButton;

    @FXML
    private ToggleGroup questionType;

    @FXML
    private AnchorPane questionTypeSelectorContainer;

    @FXML
    private TextField quizTitleTextField;

    @FXML
    private RadioButton trueOrFalseRadioButton;

}
