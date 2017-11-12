package ru.lesson.lessions.Lessons_12;

public class Counter {
    private int amount;
    public synchronized int increase(){
        amount++;
        return amount;
    }
}
