package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> flightsList() {

        List<Flight> listOfFlights = new ArrayList<>();
        listOfFlights.add(new Flight("Warsaw", "London"));
        listOfFlights.add(new Flight("Cracow", "Barcelona"));
        listOfFlights.add(new Flight("Warsaw", "Cracow"));
        listOfFlights.add(new Flight("London", "Barcelona"));
        return listOfFlights;
    }
}