package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Field {
    private List<CropRow> cropRows;
    public Field() {
        this.cropRows = new ArrayList<>();
    }
    public List<CropRow> getCropRows(){
        return cropRows;
    }
    public void setCropRows(List<CropRow> cropRows) {
        this.cropRows = cropRows;
    }
//public void addCropRow( CropRow cropRow) {
        //this.cropRows.add(cropRow);
//}

}
