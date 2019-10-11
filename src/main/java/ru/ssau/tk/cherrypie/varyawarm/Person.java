package ru.ssau.tk.cherrypie.varyawarm;

public class Person {
    private String firstName;
    private String lastName;
    private int passportId;

    class DataList {
        public void main(String[] args) {
            Person person1 = new Person("Мария", "Иванова", 361211122);
            System.out.println(person1);
            Person person2 = new Person("Алексей","Петров");
            person2 = new Person(362222222);
            Person person3 = new Person();
            person3.setFirstName("Алина");
            person3.setLastName("Васильева");
            person3.setPassportId(361132366);
        }
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    int getPassportId() {
        return passportId;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(int passportId) {
        this.passportId = passportId;
    }

    public Person(String firstName, String lastName, int passportId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
    }
}
