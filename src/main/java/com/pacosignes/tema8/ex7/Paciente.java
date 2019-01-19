package com.pacosignes.tema8.ex7;

public class Paciente {
    //basic atributes
    private int sip;
    private String name;
    private char gender;
    private int age;
    private int entryDate;
    //todo gregorian calendar
    private string psyntoms;

    //specific atributes
    private float[] preRev=new float[4];
    private boolean alta;
    private int altaDate;
    //todo gregorian calendar
    private String altaMessage;

    public Paciente(int sip, String name, char gender, int age, int entryDate, string psyntoms) {
        this.sip = sip;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.entryDate = entryDate;
        this.psyntoms = psyntoms;
    }

    public Paciente(int sip, String name, char gender, int age, int entryDate, string psyntoms, float[] preRev, boolean alta) {
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

    public void setAltaDate(int altaDate) {
        this.altaDate = altaDate;
    }
    //todo calendar
    public void setAltaMessage(String altaMessage) {
        this.altaMessage = altaMessage;
    }

    //getters
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

    public int getEntryDate() {
        return entryDate;
    }

    public string getPsyntoms() {
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
