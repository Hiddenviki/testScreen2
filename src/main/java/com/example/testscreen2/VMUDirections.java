package com.example.testscreen2;
import java.util.HashMap;

public class VMUDirections {
    //просто список направлений
    public String[] DirectionsMassive = {"Прикладная физика", "Спецразделы Матлаба", "Киберспорт", "4 года линейной алгебры"};
    public HashMap<String,Integer> Physics = new HashMap<>(); //для направления "Прикладная физика"
    //{ {"Физика": минимальный балл по физике}, {"Математика":минимальный балл по математике}, {"Русский": минимальный балл по русскому}}
    public HashMap<String,Integer> Matlab = new HashMap<>(); //для направления "Спецразделы Матлаба"
    public HashMap<String,Integer> Sport = new HashMap<>(); //для направления "Киберспорт"
    public HashMap<String,Integer> Algebra = new HashMap<>(); //для направления "4 года линейной алгебры"

    public HashMap<String,Integer> Subjects = new HashMap<>(); //прдедмет: минимальный балл



    VMUDirections()
    {
        Physics.put("Математика",40);
        Physics.put("Русский язык",50);
        Physics.put("Физика",50);

        Matlab.put("Математика",40);
        Matlab.put("Русский язык",50);

        Sport.put("Русский язык",50);

        Algebra.put("Русский язык",50);
        Algebra.put("Математика",40);

        Subjects.put("Математика",40);
        Subjects.put("Русский язык",50);
        Subjects.put("Физика",50);

    }





}
