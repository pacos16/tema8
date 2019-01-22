package com.pacosignes.tema8.ex7a;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Patient {
    //basic atributes
    private int sip;
    private String name;
    private char gender;
    private int age;

    public Patient() {
        sip = 0;
        name = "";
        gender = 'u';
        age = 0;


    }

    public Patient(int sip, String name, char gender, int age) {
        this.sip = sip;
        this.name = name;
        this.gender = gender;
        this.age = age;
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

}