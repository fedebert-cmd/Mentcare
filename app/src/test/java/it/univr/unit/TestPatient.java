package it.univr.unit;

import it.univr.model.Patient;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPatient {
    private Patient patient;
    @Before
    public void createPatient() {
        patient = new Patient("Mario", "Rossi", "rossi.mario@patient.it", 33, "Venezia", "Italia");
    }
    @Test
    public void testGetId() {
        assertEquals(0, patient.getId());
    }
    @Test
    public void testGetFirstName() {
        assertEquals("Mario", patient.getFirstName());
    }
    @Test
    public void testSetFirstName() {
        patient.setFirstName("Mario");
        assertEquals("Mario", patient.getFirstName());
    }
    @Test
    public void testGetLastName() {
        assertEquals("Rossi", patient.getLastName());
    }
    @Test
    public void testSetLastName() {
        patient.setLastName("Rossi");
        assertEquals("Rossi", patient.getLastName());
    }
    @Test
    public void testGetEmail() {
        assertEquals("rossi.mario@patient.it", patient.getEmail());
    }
    @Test
    public void testSetEmail() {
        patient.setEmail("rossi.mario@patient.it");
        assertEquals("rossi.mario@patient.it", patient.getEmail());
    }
    @Test
    public void testGetAge() { assertEquals(33, patient.getAge()); }
    @Test
    public void testSetAge() {
        patient.setAge(33);
        assertEquals(33, patient.getAge());
    }
    @Test
    public void testGetBirthPlace() {
        assertEquals("Venezia", patient.getBirthPlace());
    }
    @Test
    public void testSetBirthPlace() {
        patient.setBirthPlace("Venezia");
        assertEquals("Venezia", patient.getBirthPlace());
    }
    @Test
    public void testGetNationality() {
        assertEquals("Italia", patient.getNationality());
    }
    @Test
    public void testSetNationality() {
        patient.setNationality("Italia");
        assertEquals("Italia", patient.getNationality());
    }
}
