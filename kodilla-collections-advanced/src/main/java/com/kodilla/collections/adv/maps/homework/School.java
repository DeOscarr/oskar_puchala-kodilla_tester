package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Double> numberOfStudents = new ArrayList<>();

    public School(double... numberOfStudents) {
        for (double numberOfStudent : numberOfStudents)
            this.numberOfStudents.add(numberOfStudent);
    }

    public double getSum() {
        double sum = 0.0;
        for (double numberOfStudent : numberOfStudents)
            sum += numberOfStudent;
        return sum;
    }




    @Override
    public String toString() {
        return "School{" +
                "numberOfStudents=" + numberOfStudents +
                '}';
    }
}