package com.example.testscreen2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.VBox;
import org.jetbrains.annotations.NotNull;

import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private ChoiceBox<String> subject1;
    @FXML
    private ChoiceBox<String> subject2;
    @FXML
    private ChoiceBox<String> subject3;

    @FXML
    private Button moreButton;

    @FXML
    private TextField score1;
    @FXML
    private TextField score2;
    @FXML
    private TextField score3;

    @FXML
    private ToolBar toolBar1;
    @FXML
    private ToolBar toolBar2;
    @FXML
    private ToolBar toolBar3;

    @FXML
    @NotNull
    private VBox vBox1;

    public Integer count=1;

    public VMUDirections directions = new VMUDirections();
    public String[] massiveOfSubjects = directions.Subjects.keySet().toArray(new String[0]);
    //тут просто массив всех предметов

    private String[] availableDirections={};
    //после того как человечек вводит экзамены тут появляются доступные направления

    private String pickedSubject;
    private Integer score;



    private HashMap<String,Integer> currentExams = new HashMap<>(); //{экзамен:Баллы} //сюда надо

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
//        Enrollee enrollee1 = new Enrollee()



        subject1.getItems().addAll(massiveOfSubjects);
        subject1.setOnMouseClicked(mouseEvent -> {
            subject1.setOnAction(this::addPickedSubjAndScore);
        });



        moreButton.setOnAction(event ->
        {
            if (count==1)
            {

                //vBox1.setPadding(new Insets(10, 10));
//                vBox1.setSpacing(10);
//                ChoiceBox<String> subject2 = new ChoiceBox<>();
//                TextField score2 = new TextField();



                toolBar2 = new ToolBar();

                vBox1.getChildren().add(toolBar2);

                subject2.getItems().addAll(massiveOfSubjects);

                subject2.setOnAction(this::addPickedSubjAndScore);

                toolBar2.getItems().addAll(subject2,score2);


                count+=1;


            }

            if (count==2)
            {

                //vBox1.setPadding(new Insets(10, 10));
//                vBox1.setSpacing(10);
//                ChoiceBox<String> subject2 = new ChoiceBox<>();
//                TextField score2 = new TextField();
                toolBar3 = new ToolBar(subject3,score3);

                vBox1.getChildren().add(toolBar3);


                subject3.getItems().addAll(massiveOfSubjects);
                subject3.setOnAction(this::addPickedSubjAndScore);

                count+=1;
            }


        }); //тут пока что везде хуйня


    }

    public void addPickedSubjAndScore(ActionEvent event)
    {

        if (count==1)
        {

            try {

                toolBar1=new ToolBar(subject1, score1);
                vBox1=new VBox(toolBar1);

                pickedSubject = subject1.getValue();
                score = Integer.valueOf(score1.getText());
                //pickedSubject = subject1.getValue();

                currentExams.put(pickedSubject, Integer.valueOf(score));
                System.out.println(currentExams);
            } catch (Exception e) {
                System.out.println(e.getCause());
            }


        }
        else if (count==2)
        {
            try{

                pickedSubject = subject2.getValue();
                score = Integer.valueOf(score2.getText());
                currentExams.put(pickedSubject,score);

                System.out.println(currentExams);
            }catch (Exception e){System.out.println(e.getCause());}
            currentExams.put(pickedSubject,score);

        }
        else if (count==3)
        {
            pickedSubject = subject3.getValue();
            score = Integer.valueOf(score3.getText());
            currentExams.put(pickedSubject,score);

            System.out.println(currentExams);
        }

    }
}
