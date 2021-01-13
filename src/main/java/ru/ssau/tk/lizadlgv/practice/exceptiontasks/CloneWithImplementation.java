package ru.ssau.tk.lizadlgv.practice.exceptiontasks;

public class CloneWithImplementation implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
