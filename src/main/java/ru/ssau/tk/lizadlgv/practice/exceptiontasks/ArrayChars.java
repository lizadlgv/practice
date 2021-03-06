package ru.ssau.tk.lizadlgv.practice.exceptiontasks;

public class ArrayChars {
    public static String[] getArrayChars(String[] array, int n) {
        String[] arrayChar = new String[array.length];
        for (String string : array) {
            if (n > string.length()) {
                throw new StringIndexOutOfBoundsException();
            }
        }
        for (String string : array) {
            if (string == null) {
                throw new NullPointerException();
            }
        }
        for (int i = 0; i < array.length; i++) {
            arrayChar[i] = array[i].substring(n, n + 1);
        }
        return arrayChar;
    }

    public static char getCharOnIndex(String[] arrayStr, int n, int m) {
        if (n > arrayStr.length) {
            throw new StringIndexOutOfBoundsException();
        }
        if (m > arrayStr.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return arrayStr[n].charAt(m);
    }
}
