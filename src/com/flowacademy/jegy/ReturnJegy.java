package com.flowacademy.jegy;

public class ReturnJegy extends Jegy {

    private int hasznalatokSzama = 0;

    public ReturnJegy(int kilometer, String celallomas, int kedvezmeny) {
        super(kilometer, celallomas, kedvezmeny);
        this.hasznalatokSzama = hasznalatokSzama;
    }



    @Override
    public void felszall() {
        if( hasznalatokSzama==2 ) {
            super.felszall();
        } else {
            this.hasznalatokSzama++;
        }
    }



    @Override
    public int arKiszamit() {
        return (super.arKiszamit() * 2);
    }

    @Override
    public String toString() {
        return super.toString() + "return-jegy";
    }

}
