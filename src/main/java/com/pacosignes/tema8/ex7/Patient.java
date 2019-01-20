package com.pacosignes.tema8.ex7;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Patient {
    //basic atributes
    private int sip;
    private String name;
    private char gender;
    private int age;
    private int[] entryDate=new int[3];
    private String psyntoms;
    private boolean isWaiting;

    //specific atributes
    private float[] preRev=new float[4];
    private boolean alta;
    private int[] altaDate=new int[3];
    private String altaMessage;

    public Patient(int sip, String name, char gender, int age,String psyntoms) {
        this.sip = sip;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.psyntoms = psyntoms;

        Calendar calendar=new GregorianCalendar();
        this.entryDate[0]=calendar.get(Calendar.YEAR);
        this.entryDate[1]=calendar.get(Calendar.MONTH);
        this.entryDate[2]=calendar.get(Calendar.DAY_OF_MONTH);

    }

    public Patient(int sip, String name, char gender, int age, int[] entryDate, String psyntoms, float[] preRev, boolean alta) {
        this.sip = sip;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.entryDate = entryDate;
        this.psyntoms = psyntoms;
        this.preRev = preRev;
        this.alta = alta;
    }

    //setters

    public void setAltaDate(int[] altaDate) {
        this.altaDate = altaDate;
    }
    //todo calendar
    public void setAltaMessage(String altaMessage) {
        this.altaMessage = altaMessage;
    }

    //getters
    public boolean getIsWaiting(){
        return isWaiting;
    }
    public int getSip() {
        return sip;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int[] getEntryDate() {
        return entryDate;
    }

    public String getPsyntoms() {
        return psyntoms;
    }

    public float[] getPreRev() {
        return preRev;
    }

    public boolean isAlta() {
        return alta;
    }

    public int getAltaDate() {
        return altaDate;
    }

    public String getAltaMessage() {
        return altaMessage;
    }
}
