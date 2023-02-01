package it.univr.ui;

import it.univr.BaseTest;
import it.univr.po.ListPO;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListTest extends BaseTest {
    @Test
    public void testListPage() {
        driver.get("http://localhost:8080/list");
        ListPO listPO = new ListPO(driver);
        assertEquals("Patient List", listPO.confirmationHeader());
    }
    @Test
    public void testButtonEdit() {
        driver.get("http://localhost:8080/list");
        ListPO listPO = new ListPO(driver);
        listPO.buttonEditPress();
        assertEquals("Edit a Patient", listPO.confirmationHeader());
    }
    @Test
    public void testButtonDelete() {
        driver.get("http://localhost:8080/list");
        ListPO listPO = new ListPO(driver);
        listPO.buttonDeletePress();
        assertEquals("Patient List", listPO.confirmationHeader());
    }
    @Test
    public void testButtonHome() {
        driver.get("http://localhost:8080/list");
        ListPO listPO = new ListPO(driver);
        listPO.buttonHomePress();
        assertEquals("Welcome doctor: Rossi Mario", listPO.confirmationHeader());
    }
}
