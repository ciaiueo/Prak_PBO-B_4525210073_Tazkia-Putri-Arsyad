package com.Overriding;

public class Kucing extends Hewan {
    
    @Override
    void suara() {
        System.out.println("Kucing berkata: Meong");
    }
}