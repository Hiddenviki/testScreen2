package com.example.testscreen2;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;


public class Enrollee
{
    private Integer summOfScores=0;
    private HashMap<String,Integer> exams = new HashMap<>(); //{экзамен:Баллы}
    private HashMap<String,Integer> directions = new HashMap<>(); //{направление:Сумма баллов}

    public Enrollee()
    {

        this.exams.put("Предмет конструктора1",60);
        this.exams.put("Предмет конструктора2",60);

        this.exams.put("Направление конструктора1",60);
        this.exams.put("Направление конструктора2",60);

    }

    public Enrollee(@NotNull HashMap exams1, @NotNull HashMap directions)
    {

        exams1.forEach((key, value) -> exams.put( (String)key, (Integer) value));

        directions.forEach((key, value) -> directions.put( (String)key, (Integer) value));

    }

    public void SumOfScores()
    {
        this.exams.forEach((key, value) -> summOfScores+=this.exams.get(key));

    }

    public HashMap<String, Integer> getExams() {
        return exams;
    }

    public void setExams(HashMap<String, Integer> exams) {
        this.exams = exams;
    }

    public HashMap<String, Integer> getDirections() {
        return directions;
    }

    public void setDirections(HashMap<String, Integer> directions) {
        this.directions = directions;
    }

    public Integer getSummOfScores() {
        return summOfScores;
    }

    //private void setSummOfScores(Integer value){this.summOfScores=value;}



}
