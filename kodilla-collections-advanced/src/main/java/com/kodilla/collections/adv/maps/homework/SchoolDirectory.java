package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolDirectory = new HashMap<>();
        Principal edward = new Principal("Edward", "Rooney", "Glenbrook North High School");
        Principal seymour = new Principal("Seymour", "Skinner", "Springfield Elementary School");
        Principal albus = new Principal("Albus", "Dumbledore", "Hogwarts School of Witchcraft and Wizardry");

        School edwardSchool = new School(40, 31, 35, 37);
        School seymourSchool = new School(30, 23, 31, 28);
        School albusSchool = new School(40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40 ,40, 40, 40);

        schoolDirectory.put(edward, edwardSchool);
        schoolDirectory.put(seymour, seymourSchool);
        schoolDirectory.put(albus, albusSchool);

        for(Map.Entry<Principal, School> principalEntry : schoolDirectory.entrySet())
            System.out.println(principalEntry.getKey().getLastname() + ", łączna liczba uczniów w szkole " + principalEntry.getValue().getSum());

    }
}