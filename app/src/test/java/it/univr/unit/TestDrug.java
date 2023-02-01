package it.univr.unit;

import it.univr.model.Drug;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDrug {
    private Drug drug;
    @Before
    public void createDrug() {
        drug = new Drug("drug1");
    }
    @Test
    public void testGetId() {
        assertEquals(0, drug.getId());
    }
    @Test
    public void testGetName() {
        assertEquals("drug1", drug.getName());
    }
    @Test
    public void testSetName() {
        drug.setName("drug1");
        assertEquals("drug1", drug.getName());
    }
}
