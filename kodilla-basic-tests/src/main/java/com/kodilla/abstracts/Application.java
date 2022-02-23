package com.kodilla.abstracts;

public class Application {

    public static void main(String[] args) {
        Animal dog = new Dog();

        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dog);

        Animal Duck = new Duck();

        AnimalProcessor processor1 = new AnimalProcessor();
        processor1.process(Duck);
    }
}