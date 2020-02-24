package ru.ssau.tk.cherrypie.varyawarm;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;
import static ru.ssau.tk.cherrypie.varyawarm.Gender.FEMALE;

public class PersonTest {
    private Person person1 = new Person();
    private Person person2 = new Person();
    private Person person3 = new Person();
    private Person person4 = new Person();

    @Test
    public void testPerson() {
        person3.setFirstName("Лидия");
        person3.setLastName("Кукушкина");
        person3.setPassportId(1123);
        assertEquals(person3.getFirstName(), "Лидия");
        assertEquals(person3.getLastName(), "Кукушкина");
        assertEquals(person3.getPassportId(), 1123);
    }

    @Test
    public void testSetFirstName() {
        person1.setFirstName("Ренат");
        person2.setFirstName(null);

        assertEquals(person1.getFirstName(), "Ренат");
        assertNull(person2.getFirstName());
    }

    @Test
    public void testSetLastName() {
        person1.setLastName("Муха");
        person2.setLastName(null);

        assertEquals(person1.getLastName(), "Муха");
        assertNull(person2.getLastName());
    }

    @Test
    public void testSetPassportId() {
        person1.setPassportId(1356);
        person2.setPassportId(0);
        assertEquals(person1.getPassportId(), 1356);
        assertEquals(person2.getPassportId(), 0);
    }

    @Test
    public void testSetGender() {
        assertEquals(person4.getGender(), FEMALE);
    }

    @Test
    public void testGetGender() {
        person4.setGender(FEMALE);
        assertEquals(person4.getGender(), FEMALE);
    }
}