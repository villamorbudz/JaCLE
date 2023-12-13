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
    private AnchorPane IdentificationAnswerFieldContainer;

    @FXML
    private TextField IdentificationAnswerTextField;

    @FXML
    private Pane IdentificationQuestionCard;

    @FXML
    private TextArea IdentificationQuestionTextArea;

    @FXML
    private Button MCQAddChoicesButton;

    @FXML
    private RadioButton MCQChoice1;

    @FXML
    private ToggleGroup MCQChoices;

    @FXML
    private AnchorPane MCQContainer;

    @FXML
    private TextArea MCQTextArea;

    @FXML
    private Pane MultipleChoiceQuestionCard;

    @FXML
    private AnchorPane TFChoicesContainer;

    @FXML
    private Pane TFQuestionCard;

    @FXML
    private TextArea TFQuestionTextArea;

    @FXML
    private RadioButton TFfalseRadioButton;

    @FXML
    private RadioButton TFtrueRadioButton;

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
    private ToggleGroup trueOrFalseChoices;

    @FXML
    private RadioButton trueOrFalseRadioButton;

}
