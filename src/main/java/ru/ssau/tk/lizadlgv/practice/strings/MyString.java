package ru.ssau.tk.lizadlgv.practice.strings;

public class MyString {
    static void splitLine(String myString) {
        for (int i = 0; i < myString.length(); i++) {
            System.out.println(myString.charAt(i));
        }
    }

    static void getStringBytes(String myString) {
        byte[] stringBytes = myString.getBytes();
        for (int bytes : stringBytes) {
            System.out.println(bytes);
        }
    }

    static void checkingStrings() {
        String s1 = "S";
        String s2 = new String(s1);

        System.out.println(s2 == s1);
        System.out.println(s1.equals(s2));
    }
}
