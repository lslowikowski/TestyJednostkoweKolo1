package com.company;

public class Kolo {
    static final float PI = 3.1415F;
    private float promien;

    public Kolo(float promien) {
        //this.promien = promien;
        setPromien(promien);
    }

    public float getPromien() {
        return promien;
    }

    public void setPromien(float promien) {
        if(promien >= 0) this.promien = promien;
        else this.promien = -promien;
    }

    public float obliczObwod(){
        return 2 * PI * promien;
    }

    public  float obliczPole(){
        return  PI * promien * promien;
    }
}
