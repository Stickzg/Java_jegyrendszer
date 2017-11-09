package com.flowacademy.jegy;

public class Jegy {
    private int kilometer;
    private String celallomas;
    private boolean ervenyes = true;
    private int kedvezmeny;

    private static int jegyar = 25;

    public Jegy(int kilometer, String celallomas, int kedvezmeny) {
        this.kilometer = kilometer;
        this.celallomas = celallomas;
        this.kedvezmeny = kedvezmeny;
    }


    public int arKiszamit() {
        return Math.round(this.kilometer*(this.jegyar - (jegyar * this.kedvezmeny/100) ));
    }


    public void felszall() {
        this.ervenyes = false;
    }






    public int getKilometer() {
        return kilometer;
    }

    public void setKilometer(int kilometer) {
        this.kilometer = kilometer;
    }

    public String getCelallomas() {
        return celallomas;
    }

    public void setCelallomas(String celallomas) {
        this.celallomas = celallomas;
    }

    public boolean isErvenyes() {
        return ervenyes;
    }

    public void setErvenyes(boolean ervenyes) {
        this.ervenyes = ervenyes;
    }

    public int getKedvezmeny() {
        return kedvezmeny;
    }

    public void setKedvezmeny(int kedvezmeny) {
        this.kedvezmeny = kedvezmeny;
    }

    public static int getJegyar() {
        return jegyar;
    }

    public static void setJegyar(int jegyar) {
        Jegy.jegyar = jegyar;
    }


    @Override
    public String toString() {
        return "[Cél:" + celallomas +
                " ; Kedvezmeny: " + kedvezmeny +
                " ; Távolság: " + kilometer +
                " ; Jegyár: " + arKiszamit() +
                " Ft]";
    }


}
