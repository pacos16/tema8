package com.pacosignes.tema8.ex7a;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Attention {

    private Patient p;
    private float [] preRev;
    private boolean isAlta;
    private String altaMessage;
    private GregorianCalendar altaDate;

    public Attention(Patient p, float[] preRev){
        this.p=p;
        this.preRev=preRev;
    }

    public void setAlta(String altaMessage){

        this.altaMessage=altaMessage;
        altaDate=GregorianCalendar.getInstance();

    }



    public int getSip(){
        return p.getSip();
    }

    public boolean isAlta() {
        return isAlta;
    }
}
