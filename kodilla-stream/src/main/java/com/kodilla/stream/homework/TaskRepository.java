package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();

        tasks.add(new Task("Presentation", LocalDate.of(2022, 1, 27), LocalDate.of(2022, 3, 5)));
        tasks.add(new Task("Paper",LocalDate.of(2022, 1, 30), LocalDate.of(2022, 3, 5)));
        tasks.add(new Task("Questionnaire", LocalDate.of(2022, 1, 29), LocalDate.of(2022, 3, 1)));
        return tasks;
    }
}