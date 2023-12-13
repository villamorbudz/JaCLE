package com.example.capstoneapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class HelloController {

    @FXML
    private RadioButton MCQChoice1;

    @FXML
    private ToggleGroup MCQChoices;

    @FXML
    private ToggleGroup MCQChoices1;

    @FXML
    private ToggleGroup MCQChoices11;

    @FXML
    private TextArea MCQQuestionTitleTextArea;

    @FXML
    private Pane MultipleChoiceQuestionCard;

    @FXML
    private TextArea TFQuestionTitleTextArea;

    @FXML
    private Pane TrueOrFalseQuestionCard;

    @FXML
    private Button addQuestionButton;

    @FXML
    private AnchorPane addQuestionButtonPane;

    @FXML
    private AnchorPane choicesContainer;

    @FXML
    private AnchorPane choicesContainer1;

    @FXML
    private AnchorPane createQuizContainer;

    @FXML
    private AnchorPane createQuizMainPane;

    @FXML
    private ScrollPane createQuizScrollPane;

    @FXML
    private RadioButton falseRadioButton;

    @FXML
    private RadioButton identificationRadioButton;

    @FXML
    private RadioButton multipleChoiceRadioButton;

    @FXML
    private ToggleGroup questionType;

    @FXML
    private ToggleGroup questionType1;

    @FXML
    private AnchorPane questionTypeSelectorContainer;

    @FXML
    private TextField quizTitleTextField;

    @FXML
    private RadioButton trueOrFalseRadioButton;

    @FXML
    private RadioButton trueRadioButton;

}
