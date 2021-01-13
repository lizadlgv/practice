package ru.ssau.tk.lizadlgv.practice.point;

public class IntGeneratorImpl implements IntGenerator {
    private int count = 0;

    @Override
    public int nextInt() {
        return count++;
    }
}
