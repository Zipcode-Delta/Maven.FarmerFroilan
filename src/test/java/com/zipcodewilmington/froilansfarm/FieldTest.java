package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FieldTest {
    private Field field;
    private CropRow row1, row2;
    @BeforeEach
    void setUp() {
        field = new Field ();
        row1 = new CropRow();
        row2 = new CropRow();
    }
    @Test
    void testAddCropRow() {
        field.addCropRow(row1);
        field.addCropRow(row2);
        List<CropRow>cropRows = field.getCropRows();
        assertEquals(2, cropRows.size());
    }

    @Test
    void testFieldStartsEmpty(){
        assertTrue("No CropRows before starting Field", field.getCropRows().isEmpty());
    }
}
