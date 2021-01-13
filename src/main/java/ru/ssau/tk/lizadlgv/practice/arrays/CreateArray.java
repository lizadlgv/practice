package ru.ssau.tk.lizadlgv.practice.arrays;

public class CreateArray {
    static int[] createArray(int n) {
        return new int[n];
    }

    static int[] generateOnesArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = 1;
        }
        array[0] = 2;
        array[n - 1] = 2;
        return array;
    }
}
