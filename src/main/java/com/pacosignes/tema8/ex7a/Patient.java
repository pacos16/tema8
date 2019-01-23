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
    public Patient(int sip){
        this.sip=sip;
    }

    public Patient(int sip, String name, char gender, int age) {
        this.sip = sip;
        this.name = name;
        this.gender = Character.toLowerCase(gender);
        this.age = age;
    }

    public boolean setName(String name) {

        if(name.length()<3 || name.length()>30) {
            this.name = name;
            return true;
        }else{
            return false;
        }
    }

    public boolean setGender(char gender) {
        gender=Character.toLowerCase(gender);
        if(gender=='h'|| gender =='m'){
            this.gender = gender;
            return true;
        }
        return false;
    }

    public boolean setAge(int age) {
        if (age<0 || age>150){
            this.age = age;
            return true;
        }
        return false;
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