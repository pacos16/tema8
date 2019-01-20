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

    public Patient(Patient p, float[] preRev) {
        this.sip=p.getSip();
        this.name=p.getName();
        this.gender=p.getGender();
        this.age=p.getAge();
        this.psyntoms = p.psyntoms;
        this.preRev = preRev;
    }

    //setters

    public void setPreRev(float[] preRev) {
        this.preRev = preRev;
    }
    public void setIsWaiting(boolean b){
        this.isWaiting=b;
    }

    public void setAltaDate(int[] altaDate) {
        this.altaDate = altaDate;
    }

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

    public int[] getAltaDate() {
        return altaDate;
    }

    public String getAltaMessage() {
        return altaMessage;
    }


    public String toString(){
        return ""+String.format("%12d",sip)+String.format("%30s",name)+String.format()
    }
}
