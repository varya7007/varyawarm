package ru.ssau.tk.cherrypie.varyawarm;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {
    private Person person1 = new Person();
    private Person person2 = new Person();
    private Person person3 = new Person();
    private Person person4 = new Person(null, null);
    private Person person5 = new Person();

    @Test
    public void testPerson() {
        person3.setFirstName("Лидия");
        person3.setLastName("Кукушкина");
        person3.setPassportId(1123);
        assertEquals(person3.getFirstName(),"Лидия");
        assertEquals(person3.getLastName(),"Кукушкина");
        assertEquals(person3.getPassportId(),1123);
    }

    @Test
    public void testSetFirstName() {
        person1.setFirstName("Ренат");
        person2.setFirstName(null);

        assertEquals(person1.getFirstName(), "Ренат");
        assertEquals(person2.getFirstName(), null);
    }

    @Test
    public void testSetLastName() {
        person1.setLastName("Муха");
        person2.setLastName(null);

        assertEquals(person1.getLastName(), "Муха");
        assertEquals(person2.getLastName(), null);
    }

    @Test
    public void testSetPassportId() {
        person1.setPassportId(1356);
        person2.setPassportId(0000);
        assertEquals(person1.getPassportId(),1356);
        assertEquals(person2.getPassportId(),0000);
    }
}