package com.example.testscreen2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private ChoiceBox<String> subject1;

    @FXML
    private Button moreButton;

    @FXML
    private TextField score1;

    @FXML
    private ToolBar toolBar1;

    public Integer count=1;

    public VMUDirections directions = new VMUDirections();
    public String[] massiveOfSubjects = directions.Subjects.keySet().toArray(new String[0]);
    //тут просто массив всех предметов

    private String[] availableDirections={};
    //после того как человечек вводит экзамены тут появляются доступные направления

    private HashMap<String,Integer> currentExams = new HashMap<>(); //{экзамен:Баллы} //сюда надо

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
//        Enrollee enrollee1 = new Enrollee()


        subject1.getItems().addAll(massiveOfSubjects);
        subject1.setOnAction(this::addPickedSubjAndScore);
//        moreButton.setOnAction(event ->
//        {
//            if (count<4)
//            {
//                ToolBar toolBar = new ToolBar();
//                ChoiceBox<String> subject2 = new ChoiceBox<>();
//                subject2.getItems().addAll(massiveOfSubjects);
//                subject2.setOnAction(this::addPickedSubjAndScore);
//
//                toolBar(subject1,score1);
//                count+=1;
//            }
//
//
//        });


    }

    public void addPickedSubjAndScore(ActionEvent event)
    {
        if (score1.getText()!=null && subject1.getValue()!=null)
        {
            String pickedSubject = subject1.getValue();
            Integer score = Integer.valueOf(score1.getText());
            currentExams.put(pickedSubject,score);

            System.out.println(currentExams);
        }

    }
}
