package ru.ssau.tk.lizadlgv.practice.person;

public class Checking {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Arkadiy");
        int number = 5;
        checkInt(number);
        checkPerson(person);
        System.out.println(number);
        System.out.println(person.getFirstName());
    }

    private static void checkInt(int number) {
        number = 10;
        System.out.println(number);
    }

    private static void checkPerson(Person person) {
        person.setFirstName("Oleg");
        System.out.println(person.getFirstName());
    }

    /*Сначала выполняется метод checkInt() и выводится число 10, несмотря на то, что мы передаем в этот метод 5.
     * Это происходит из-за того, что аргументы-примитивы передаются по значению и их можно редактировать, что внутри метода и
     * сделано (number = 10). Аналогично с методом checkPerson — только Person это ссылочный тип, в аргументе передается
     * ссылка на объект person. Внутри main выдаст 5, т.к. копия с number = 10 осталась в методе checkInt, а имя выведет
     * Oleg, т.к. в метод checkPerson объект person передавался по ссылке и имя изменилось у объекта вообще, созданного в
     * main-классе*/
}
