package com.kodilla.inheritance.homework;

public class Person {

    private final String firstName;
    private final int age;
    private final Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }


    public void displayFirstName() {
        System.out.print("Imię: " + firstName + ", ");
    }
    public void displayAge() {
        System.out.println("Wiek: " + age);
    }
    public void displayJob() {
        System.out.println("zawód: " +job.getJobName());
    }
    public void displayResponsibilities() {
        System.out.println(job);
    }
    public void displaySalary(){System.out.println("Zarobki: "+job.getSalary());}

    public static void main(String[] args) {
    {
        Person teacher2 = new Person("Magda", 44, new Teacher(3500, "Nauczanie", "Nauczyciel."));
        teacher2.displayFirstName();
        teacher2.displayJob();
        teacher2.displayResponsibilities();
        teacher2.displayAge();
        teacher2.displaySalary();




        Person doctor2 = new Person("Maja", 37, new Doctor(1500, "Leczenie", "Doktor."));
        doctor2.displayFirstName();
        doctor2.displayJob();
        doctor2.displayResponsibilities();
        doctor2.displayAge();
        doctor2.displaySalary();


        Person CEO2 = new Person("Filip", 50, new CEO(6500, "Zarządzanie", "CEO."));
        CEO2.displayFirstName();
        CEO2.displayJob();
        CEO2.displayResponsibilities();
        CEO2.displayAge();
        CEO2.displaySalary();


        Person Lawyer2 = new Person("Maciej", 43, new Lawyer(8000, "Interpretowanie prawa", "Prawnik."));
        Lawyer2.displayFirstName();
        Lawyer2.displayJob();
        Lawyer2.displayResponsibilities();
        Lawyer2.displayAge();
        Lawyer2.displaySalary();

    }
}
}