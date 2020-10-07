package com.kodilla.collections.adv.immutable.homework;

public class Task {  //klasa Task, która będzie posiadała dwa pola: String title oraz int duration. Spraw, aby klasa Task była niemutowalna.

protected final String title;
protected final int duration;

public Task(String title, int duration){
    this.title=title;
    this.duration=duration;
}

    public final String getTitle() {
        return title;
    }

    public final int getDuration() {
        return duration;
    }
}
