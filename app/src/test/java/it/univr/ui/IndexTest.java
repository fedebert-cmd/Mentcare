package it.univr.ui;

import it.univr.BaseTest;
import it.univr.po.IndexPO;
import it.univr.po.ListPO;
import org.junit.Test;
import static org.junit.Assert.*;

public class IndexTest extends BaseTest {
    @Test
    public void testIndexPage() {
        driver.get("http://localhost:8080/");
        IndexPO indexPO = new IndexPO(driver);
        assertEquals("Welcome doctor: Rossi Mario", indexPO.confirmationHeader());
    }
    @Test
    public void testButtonShowPatientList() {
        driver.get("http://localhost:8080/");
        IndexPO indexPO = new IndexPO(driver);
        indexPO.buttonShowPatientListPress();
        assertEquals("Patient List", indexPO.confirmationHeader());
    }
    @Test
    public void testButtonCreateNewPatient() {
        driver.get("http://localhost:8080/");
        IndexPO indexPO = new IndexPO(driver);
        indexPO.buttonCreateNewPatientPress();
        assertEquals("Create new Patient", indexPO.confirmationHeader());
    }
    @Test
    public void testButtonShowPrescriptionList() {
        driver.get("http://localhost:8080/");
        IndexPO indexPO = new IndexPO(driver);
        indexPO.buttonShowPrescriptionListPress();
        assertEquals("Prescription List", indexPO.confirmationHeader());
    }
}
