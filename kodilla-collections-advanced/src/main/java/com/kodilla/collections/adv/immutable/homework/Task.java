package com.kodilla.collections.adv.immutable.homework;

public final class Task {
    private final String title;
    private final int duration;

    public Task(String title, int duration) { //mutowalnosc zachodzi wtedy gdy zmienna ma wartosc i przypisujesz do niej ponownie inna wartosc
        this.title = title;
        this.duration = duration;
    }

    public final String getTitle() { return title; }
    public final int getDuration() { return duration; }
}