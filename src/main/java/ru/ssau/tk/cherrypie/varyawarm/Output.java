package ru.ssau.tk.cherrypie.varyawarm;

public class Output {
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


}
/*Оба раза выводится новое имя, така как в checkAnotherPerson создается новая переменная, которая хранит новое имя*/