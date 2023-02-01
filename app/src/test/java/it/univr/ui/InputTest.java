package it.univr.ui;

import it.univr.BaseTest;
import it.univr.po.InputPO;
import it.univr.po.ListPO;
import org.junit.Test;

import static org.junit.Assert.*;

public class InputTest extends BaseTest {
    @Test
    public void testInputPage() {
        driver.get("http://localhost:8080/input");
        InputPO inputPO = new InputPO(driver);
        assertEquals("Create new Patient", inputPO.confirmationHeader());
    }
    @Test
    public void testAddPatient() {
        driver.get("http://localhost:8080/input");
        InputPO inputPO = new InputPO(driver);
        inputPO.enterPatient("Alberto", "Gialli", "gialli.alberto@patient.it", 41, "Milano", "Italia");
        inputPO.submitButtonPress();
        ListPO listPO = new ListPO(driver);
        assertEquals("Patient List", listPO.confirmationHeader());
        assertEquals("Alberto", listPO.confirmationFirstName2());
        assertEquals("Gialli", listPO.confirmationLastName2());
        assertEquals("gialli.alberto@patient.it", listPO.confirmationEmail2());
        assertEquals("41", listPO.confirmationAge2());
        assertEquals("Milano", listPO.confirmationBirthPlace2());
        assertEquals("Italia", listPO.confirmationNationality2());
    }
}
