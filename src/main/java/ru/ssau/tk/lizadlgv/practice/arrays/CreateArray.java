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

    static int[] generateOddNumbers(int n) {
        int[] array = new int[n];
        int k = 1;
        for (int i = 0; i < n; i++) {
            array[i] = k;
            k = k + 2;
        }
        return array;
    }

    static int[] generateFlippedEvenNumbers(int n) {
        int[] array = new int[n];
        int k = n * 2;
        for (int i = 0; i < n; i++) {
            array[i] = k;
            k = k - 2;
        }
        return array;
    }

    static int[] generateFibonacci(int n) {
        if (n == 1) {
            return new int[]{1};
        } else if (n == 2) {
            return new int[]{1, 1};
        } else {
            int[] array = new int[n];
            array[0] = 1;
            array[1] = 1;
            for (int i = 2; i < n; i++) {
                array[i] = array[i - 1] + array[i - 2];
            }
            return array;
        }
    }

    static int[] generatePowIndex(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i * i;
        }
        return array;
    }

    static double[] solveQuadraticEquation(double a, double b, double c) {
        if (a == 0) {
            return new double[]{-c / b};
        }

        double D = b * b - 4 * a * c;
        if (D < 0) {
            return new double[]{};
        } else if (D == 0) {
            return new double[]{-b / (2 * a)};
        } else {
            double[] array = new double[2];
            array[0] = (-b + Math.sqrt(D)) / 2;
            array[1] = (-b - Math.sqrt(D)) / 2;
            return array;
        }
    }

    static int[] getWithoutMultiplesOfThree(int n) {
        int[] array = new int[n];
        int k = 1;
        for (int i = 0; i < n; i++) {
            array[i] = k;
            k++;
            if (k % 3 == 0) {
                k++;
            }
        }
        return array;
    }
}
