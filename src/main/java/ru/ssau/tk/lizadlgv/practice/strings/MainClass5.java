package ru.ssau.tk.lizadlgv.practice.strings;

public class MainClass5 {
    public static void main(String[] args) {
        String s1 = "Home";
        String s2 = "home";
        String s3 = "хоме";
        System.out.println(MyString.differentInRegister(s1, s2));
        System.out.println(MyString.differentInRegister(s3, s2));
    }
}
