package com.kodilla.collections.adv.immutable.homework;

public class ImmutableTask {
    public static void main(String[] args) {
        Task task = new Task("7 Dróg",4 );
        TaskHacked taskHacked= (TaskHacked) task;
        taskHacked.modifyTitle("Droga Toyoty");
        taskHacked.modifyDuration(8);
        System.out.println(task.getDuration());

        System.out.println(task.getTitle()+ " " + task.getDuration());
    }
}
