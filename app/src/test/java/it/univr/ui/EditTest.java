package it.univr.ui;

import it.univr.BaseTest;
import it.univr.po.EditPO;
import it.univr.po.ListPO;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EditTest extends BaseTest {
    @Test
    public void testEditPage() {
        driver.get("http://localhost:8080/list");
        ListPO listPO = new ListPO(driver);
        listPO.buttonEditPress();
        EditPO editPO = new EditPO(driver);
        assertEquals("Edit a Patient", editPO.confirmationHeader());
    }
    @Test
    public void testEditPatient() {
        driver.get("http://localhost:8080/list");
        ListPO listPO = new ListPO(driver);
        listPO.buttonEditPress();
        EditPO editPO = new EditPO(driver);
        editPO.editPatient("Alberto", "Gialli", "gialli.alberto@patient.it", 41, "Milano", "Italia");
        editPO.submitButtonPress();
        assertEquals("Patient List", listPO.confirmationHeader());
        assertEquals("Alberto", listPO.confirmationFirstName1());
        assertEquals("Gialli", listPO.confirmationLastName1());
        assertEquals("gialli.alberto@patient.it", listPO.confirmationEmail1());
        assertEquals("41", listPO.confirmationAge1());
        assertEquals("Milano", listPO.confirmationBirthPlace1());
        assertEquals("Italia", listPO.confirmationNationality1());
    }
}
