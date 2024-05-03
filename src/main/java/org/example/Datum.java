package org.example;

import java.time.LocalDate;

public class Datum {
    private LocalDate datum;

    public Datum (String datum){
        this.datum=LocalDate.parse(datum);
    }

    @Override
    public String toString() {
        return String.valueOf(this.datum);
    }


}

