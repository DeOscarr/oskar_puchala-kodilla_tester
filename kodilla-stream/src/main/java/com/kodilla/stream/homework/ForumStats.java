package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.OptionalDouble;

public class ForumStats {
    public static void main(String[] args) {

        OptionalDouble avgNumberOfPosts = UsersRepository.getUsersList()
                .stream()
                .filter(z -> z.getAge() >= 40)
                .map(User::getNumberOfPost)//transformując po kolei każdy z jej elementów, zwraca nową tablicę ze zmodyfikowaną zawartością
                .mapToInt(x -> x)
                .average();
                //.getAsDouble();

        System.out.println("The average number of posts of somebody over 40 years old equals: "+avgNumberOfPosts);


         double avgsNumberOfPosts = UsersRepository.getUsersList()//TODO
                .stream()
                .filter(z -> z.getAge() < 40)
                .map(User::getNumberOfPost)
                .mapToInt(x -> x)
                .average().orElse(0.0);
                //.getAsDouble(); = zamiast uzywac getAsdouble lepiej uzyc orElse bo jest to bezpieczniejsze kiedy nie ma obiektu w optional
        System.out.println("The average number of posts of somebody under 40 years old equals: "+avgsNumberOfPosts);
    }
}