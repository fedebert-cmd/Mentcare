package it.univr.unit;

import it.univr.model.Prescription;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrescription {
    private Prescription prescription;
    @Before
    public void createPrescription() { prescription = new Prescription("luca.bianchi@doc.it","drug1", "rossi.mario@patient.it", "50mg"); }
    @Test
    public void testGetId() {
        assertEquals(0, prescription.getIdPrescription());
    }
    @Test
    public void testGetDoctor() {
        assertEquals("luca.bianchi@doc.it", prescription.getDoctor());
    }
    @Test
    public void testSetDoctor() {
        prescription.setDoctor("luca.bianchi@doc.it");
        assertEquals("luca.bianchi@doc.it", prescription.getDoctor());
    }
    @Test
    public void testGetDrug() {
        assertEquals("drug1", prescription.getDrug());
    }
    @Test
    public void testSetDrug() {
        prescription.setDrug("drug1");
        assertEquals("drug1", prescription.getDrug());
    }
    @Test
    public void testGetPatient() {
        assertEquals("rossi.mario@patient.it", prescription.getPatient());
    }
    @Test
    public void testSetPatient() {
        prescription.setPatient("rossi.mario@patient.it");
        assertEquals("rossi.mario@patient.it", prescription.getPatient());
    }
    @Test
    public void testGetDosage() {
        assertEquals("50mg", prescription.getDosage());
    }
    @Test
    public void testSetDosage() {
        prescription.setDosage("50mg");
        assertEquals("50mg", prescription.getDosage());
    }
}
