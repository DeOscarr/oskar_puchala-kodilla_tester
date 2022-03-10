package com.kodilla.stream.homework; //juz dziala

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        List<LocalDate> deadline = TaskRepository.getTasks()
                .stream()
                .map(Task::getDeadline)                                //.map(t->t.getDeadline())
                .filter(xDeadline -> xDeadline.isAfter(currentDate))//.filter(t -> t.getDeadline().isAfter(currentDate))
                .collect(Collectors.toList());
        System.out.println(deadline);
        }
    }

