package com.example.capstoneapp;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;

import java.io.IOException;
import java.util.ArrayList;

public class CreateQuizController { @FXML
private TilePane CardFields;

    @FXML
    private Button IdentifcationBtn;

    @FXML
    private Button MultipleChoiceBtln;

    @FXML
    private Button SaveBtn;

    @FXML
    private Button TrueFalseBtn;

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
    private AnchorPane questionTypeSelectorContainer;

    @FXML
    private TextField quizTitleTextField;
    public void AddCard() throws IOException {
        ToggleAddQuestion();
    }

    public void ToggleAddQuestion(){
        if(questionTypeSelectorContainer.isDisable() == true) {
            questionTypeSelectorContainer.setDisable(false);
            questionTypeSelectorContainer.setVisible(true);
            addQuestionButton.setDisable(true);
            addQuestionButton.setVisible(false);
        }else{
            questionTypeSelectorContainer.setDisable(true);
            questionTypeSelectorContainer.setVisible(false);
            addQuestionButton.setDisable(false);
            addQuestionButton.setVisible(true);
        }

    }

    public void AddIdentificationCard() throws IOException {
        AppendToPanel(GetFromTemplate("IdentificationMakeTemplate.fxml"));
        ToggleAddQuestion();
    }

    public void AddMultipleChoiceCard() throws IOException {
        AppendToPanel(GetFromTemplate("MultipleChoiceQuestionCard.fxml"));
        ToggleAddQuestion();
    }

    public void AddTrueFalseCard() throws IOException {
        AppendToPanel(GetFromTemplate("TrueOrFalseQuestionCard.fxml"));
        ToggleAddQuestion();
    }

    //FlyWeight?
    private Pane GetFromTemplate(String url) throws IOException {
        FXMLLoader Template = new FXMLLoader(MainUIApplication.class.getResource(url));
        Pane res = (Pane) Template.load();
        ((Button) res.lookup("#MCQAddChoicesButton")).setOnAction(event -> AddChoice());
        return res;
    }

    private void AddChoice(){
        return;
    }


    private void AppendToPanel(Pane p){
        ObservableList<Node> classes = CardFields.getChildren();
        classes.add(classes.size()-1,p);
    }


}
