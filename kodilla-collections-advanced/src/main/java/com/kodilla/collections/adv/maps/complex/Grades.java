package com.kodilla.collections.adv.maps.complex;

import java.util.ArrayList;
import java.util.List;

public class Grades {
    private List<Double> grades = new ArrayList<>();

    public Grades (double... grades){           //zapis double... grades oznacza ze jako argument mozna podac dowolna ilosc liczb typu double oddzielajac je przecinkami
        for (double grade : grades)             //grades to tablica, do ktorej elementow mozemy sie dostac podajac index (np Grades[2]), a liczbe ocen w tablicy mozemy sprawdzic
            this.grades.add(grade);             //przy pomocy grades.length
    }                                           //przepisujemy teraz oceny z tablicy grades do listy grades

    public double getAverage(){
        double sum= 0.0;
        for (double grade: grades)               //W tej linii znajduje się deklaracja pętli for-each. Pętla ta iteruje (przebiega) po kolejnych elementach zapisanych w kolekcji grades.
            sum +=grade;
        return sum/grades.size();               // Każdy z elementów tej kolekcji jest kolejno pobierany i wstawiany do zmiennej grade (typu double).
    }

    @Override
    public String toString() {
        return "Grades: " + grades.toString();
    }
}