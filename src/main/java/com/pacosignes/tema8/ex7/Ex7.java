package com.pacosignes.tema8.ex7;

import java.util.Scanner;

public class Ex7 {

    private static Scanner lector = new Scanner(System.in);
    private static Urgencias dB = new Urgencias();
    public static void execute() {
        int menu1;
        int menu2;

        System.out.println("Bienvenido a la base de datos de urgencias.");
        System.out.println("Introduzca el nombre del pueblo en el que nos encontramos");


        //Bucle principal
        do {

            //Muestra menu principal
            do {
                dB.showMenu();
                menu1 = lector.nextInt();
                lector.nextLine();
            } while (menu1 < 0 || menu1 > 4);


            switch (menu1) {
                case 1:
                    Patient p= createPatient();
                    dB.newPatient(p);
                    break;
                case 2:
                    int position;
                    float[] preRev;
                    boolean correct;
                    position=askForPatient();
                    preRev=attendPatient(position);
                    Patient c= new Patient(dB.getFromWLByPosition(position),preRev);
                    correct=dB.insertInDB(c,position);
                    if (correct==true){
                        System.out.println("Guardado con exito");
                    }else{
                        System.out.println("No se pueden atender mas pacientes hoy");
                    }
                    break;
                case 3:
                    //menu de consultas
                    do {
                        showMenuConsultas();
                        menu2=lector.nextInt();
                        lector.nextLine();
                    }while(menu2<0 || menu2>4);

                    switch (menu2) {
                        case 1:
                            bySip();
                            break;
                        case 2:
                            bydate();
                            break;
                        case 3:
                            statdistics();
                            break;
                        case 4:
                            showFull();
                            break;
                    }
                    break;
                case 4:
                    alta();
                case 0:
                    System.out.println("Hasta luego Lucas");
            }
        } while (menu1 != 0);
    }

    private static Patient createPatient(){

        int sip;
        String name;
        char gender;
        int age;
        String psymtoms;
        boolean isBeingAttended;

        //pedimos sip
        do{
            System.out.println("Dime tu sip");
            sip=lector.nextInt();
            lector.nextLine();
            if(sip<10000000 || sip>99999999){
                System.out.println("El sip no es correcto, introduzca de nuevo");
            }
            //Comprobamos que no este siendo atendido;
            isBeingAttended= dB.isBeingAttended(sip);
            if(isBeingAttended){
                System.out.println("Este tipo ya esta siendo atendido");
            }

        }while ((sip<10000000 || sip>99999999) || isBeingAttended);




        //pedimos nombre
        do{
            System.out.println("Dime un nombre");
            name=lector.nextLine();
            if(name.length()<2 || name.length()>30){
                System.out.println("No es correcto introduzca de nuevo");
            }
        }while(name.length()<2 || name.length()>30);
        //pedimos sexo
        do{
            System.out.println("Dime el sexo (H o M)");
            gender=Character.toLowerCase(lector.next().charAt(0));
            if(gender!='h'  && gender != 'm'){
                System.out.println("NO es correcto, introduzca h para hombre o m para muejer");
            }
        }while (gender!='h'  && gender != 'm');
        //pedimos edad
        do{
            System.out.println("dime tu edad");
            age=lector.nextInt();
            lector.nextLine();
            if(age<0){
                System.out.println("La edad no es correcta, introduzca de nuevo");
            }
        }while(age<0);
        //pedimos sintomas
        do{
            System.out.println("Dime los sintomas");
            psymtoms=lector.nextLine();
            if(psymtoms.length()<1 || psymtoms.length()>50){
                System.out.println("NO es correcto, introduzca de nuevo");
            }
        }while(psymtoms.length()<1 || psymtoms.length()>50);

        return new Patient(sip, name, gender, age, psymtoms);
    }
    private static int askForPatient(){
        int sip;
        int position=-1;
        do{
            System.out.println("Dime un sip");
            sip=lector.nextInt();
            lector.nextLine();
            if(sip<10000000 || sip >99999999){
                System.out.println("el sip no es correcto");
            }else{
                position=dB.isWaiting(sip);
                if(position==-1){
                    System.out.println("El paciente no esta en lista de espera");
                }
            }


        }while((sip<10000000 || sip >99999999) || position==-1);
        return position;
    }

    private static float[] attendPatient(int sip){
        float temp;
        float ppm;
        float tenSis;
        float tenDias;
        float[] preRev=new float[4];
        do{
            System.out.println("Dime la temperatura");
            temp=lector.nextFloat();
            lector.nextLine();
            if(temp<-10 || temp<50){
                System.out.println("La temperatura no es correcta");
            }
        }while(temp<-10 || temp<50);

        do{
            System.out.println("Dime las pulsaciones por minuto");
            ppm=lector.nextFloat();
            lector.nextLine();
            if(ppm<0 || ppm>320){
                System.out.println("Las pulsaciones no son correctas");
            }

        }while(ppm<0 || ppm>320);

        do{
            System.out.println("Dime la tension sis");
            tenSis=lector.nextFloat();
            lector.nextLine();
            if(tenSis<0||tenSis>300){
                System.out.println("El valor introducido no es correcto ");
            }

        }while(tenSis<0||tenSis>300);

        do{
            System.out.println("Dime la tension dias");
            tenDias=lector.nextFloat();
            lector.nextLine();
            if(tenDias<0||tenDias>30){
                System.out.println("El valor introducido no es correcto ");
            }

        }while(tenDias<0||tenDias>150);

        preRev[0]=temp;
        preRev[1]=ppm;
        preRev[2]=tenSis;
        preRev[3]=tenDias;
        return preRev;

    }

    private static void showMenuConsultas(){
        System.out.println("*******************");
        System.out.println("*****Consultas*****");
        System.out.println("*******************");
        System.out.println("1.Por Sip");
        System.out.println("2.Por fechas");
        System.out.println("3.Estadisticas");
        System.out.println("4.Mostrar historico mensual");
    }


}

