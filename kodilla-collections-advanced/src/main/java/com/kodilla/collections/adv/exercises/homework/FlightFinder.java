package com.kodilla.collections.adv.exercises.homework;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightFinder {

    public List<Flight> findFlightsFrom(String departure) {
        return FlightRepository.flightsList().stream()
                .filter(flight -> departure.equals(flight.getDeparture()))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsTo(String arrival) {
        return FlightRepository.flightsList().stream()
                .filter(flight -> arrival.equals(flight.getArrival()))
                .collect(Collectors.toList());
    }

}