package com.kodilla.inheritance.homework;

public class Job
{

    private final int salary;
    private final String responsibilities;
    private final String jobName;

    public Job(int salary, String responsibilities, String job)
    {
        this.salary = salary;
        this.responsibilities=responsibilities;
        this.jobName =job;
    }
    public String getJobName()
    {
        return jobName;
    }
    public String toString()
    {
        return "Obowiązki w pracy to " + responsibilities + ".";
    }

    public int getSalary() {
        return salary;
    }
}