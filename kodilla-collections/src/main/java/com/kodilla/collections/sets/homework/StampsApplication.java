package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set; //set = zbiór

public class StampsApplication {
    public static void main(String[] args) {

    Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Czarna pensówka",30.0, 40.0, true));
        stamps.add(new Stamp("Hawajski misjonarz",50.0, 50.0, false));
        stamps.add(new Stamp("Amerykański Franklin 'Z-Grill'",25.5, 15.5, true));
        stamps.add(new Stamp("Jednocentowy czarny z Gujany Brytyjskiej na magencie",60.0, 20.0, false));
        stamps.add(new Stamp("Odwrócona Jenny",12.2, 13.3, true));
        stamps.add(new Stamp("Mauritius",35.9, 45.1, false));

        stamps.add(new Stamp("Trzy-skilingowy żółty",50.0, 50.0, true));
        stamps.add(new Stamp("Trzy-skilingowy żółty",50.0, 50.0, true));
        stamps.add(new Stamp("Trzy-skilingowy żółty",50.0, 50.0, true));

        System.out.println("The size of the stamps set equals: "+stamps.size());

        for (Stamp stamp : stamps){
            System.out.println(stamps);
        }
    }
}
