package ru.ssau.tk.lizadlgv.practice.person;

public class Checking {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Arkadiy");
        checkAnotherPerson(person);
        System.out.println(person.getFirstName());
    }

    private static void checkAnotherPerson(Person person) {
        person = new Person();
        person.setFirstName("Ignat");
        System.out.println(person.getFirstName());
    }

    /*Сначала выводится Игнат, т.к. создается новый объект и присвается ссылке person внутри метода. После
     * завершения метода измененная ссылка вместе с новым объектом убивается сборщиком мусора и в main-методе выводится
     * Arkadiy, определённый в main*/
}
