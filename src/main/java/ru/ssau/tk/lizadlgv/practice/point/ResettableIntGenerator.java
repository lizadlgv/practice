package ru.ssau.tk.lizadlgv.practice.point;

public class ResettableIntGenerator implements Resettable, IntGenerator {
    private int count = 0;
    String name = "Absent";

    @Override
    public int nextInt() {
        return count++;
    }

    @Override
    public void reset() {
        count = 0;
    }

    public String getName() {
        return name;
    }
}
