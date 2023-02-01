package it.univr.ui;

import it.univr.BaseTest;
import it.univr.po.PrescriptionPO;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrescriptionTest extends BaseTest {
    @Test
    public void testPrescriptionPage() {
        driver.get("http://localhost:8080/prescription");
        PrescriptionPO prescriptionPO = new PrescriptionPO(driver);
        assertEquals("Prescription List", prescriptionPO.confirmationHeader());
    }
    @Test
    public void testButtonHome() {
        driver.get("http://localhost:8080/prescription");
        PrescriptionPO prescriptionPO = new PrescriptionPO(driver);
        prescriptionPO.buttonHomePress();
        assertEquals("Welcome doctor: Rossi Mario", prescriptionPO.confirmationHeader());
    }

}
