package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

class PersonSources {

    static Stream<Arguments> provideArgumentsToTestBMI() {
        return Stream.of(
                Arguments.of("Very severely underweight", new Person(1.80, 40)),
                Arguments.of("Severely underweight", new Person(1.80, 51)),
                Arguments.of("Underweight", new Person(1.80, 55)),
                Arguments.of("Normal (healthy weight)", new Person(1.80, 70)),
                Arguments.of("Overweight", new Person(1.80, 85)),
                Arguments.of("Obese Class I (Moderately obese)", new Person(1.80, 100)),
                Arguments.of("Obese Class II (Severely obese)", new Person(1.80, 120)),
                Arguments.of("Obese Class III (Very severely obese)", new Person(1.80, 140)),
                Arguments.of("Obese Class IV (Morbidly Obese)", new Person(1.80, 155)),
                Arguments.of("Obese Class V (Super Obese)", new Person(1.80, 170)),
                Arguments.of("Obese Class VI (Hyper Obese)", new Person(1.80, 200))
        );
    }

}