package it.univr.unit;

import it.univr.model.Doctor;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class TestDoctor {
    private Doctor doctor;
    @Before
    public void createDoctor() {
        doctor = new Doctor("Luca", "Bianchi", "luca.bianchi@doc.it", "password");
    }
    @Test
    public void testGetId() {
        assertEquals(0, doctor.getId());
    }
    @Test
    public void testGetFirstName() {
        assertEquals("Luca", doctor.getFirstName());
    }
    @Test
    public void testSetFirstName() {
        doctor.setFirstName("Luca");
        assertEquals("Luca", doctor.getFirstName());
    }
    @Test
    public void testGetLastName() {
        assertEquals("Bianchi", doctor.getLastName());
    }
    @Test
    public void testSetLastName() {
        doctor.setLastName("Bianchi");
        assertEquals("Bianchi", doctor.getLastName());
    }
    @Test
    public void testGetEmail() {
        assertEquals("luca.bianchi@doc.it", doctor.getEmail());
    }
    @Test
    public void testSetEmail() {
        doctor.setEmail("luca.bianchi@doc.it");
        assertEquals("luca.bianchi@doc.it", doctor.getEmail());
    }
    @Test
    public void testGetPassword() {
        assertEquals("password", doctor.getPassword());
    }
    @Test
    public void testSetPassword() {
        doctor.setPassword("password");
        assertEquals("password", doctor.getPassword());
    }
}
