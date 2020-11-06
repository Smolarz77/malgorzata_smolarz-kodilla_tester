package com.kodilla.collections.adv.immutable.homework;

public class TaskHacked extends Task {
    private String realTitle;
    private int realDuration;

    public TaskHacked(String title, int duration) {
        super(title, duration);
        realTitle=title;


    }

    public void modifyTitle(String newTitle) {

        realTitle = newTitle;
    }

    public void modifyDuration(int newDuration) {
        realDuration = newDuration;
    }

    public String getRealTitle() {
        return realTitle;
    }

    public int getRealDuration() {
        return realDuration;
    }
}
