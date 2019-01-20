package com.pacosignes.tema8.ex7;

import java.util.Scanner;

public class Ex7 {
    public static void execute() {
        int menu1;
        int menu2;
        Urgencias town = new Urgencias();
        Scanner lector = new Scanner(System.in);

        System.out.println("Bienvenido a la base de datos de urgencias.");
        System.out.println("Introduzca el nombre del pueblo en el que nos encontramos");


        //Bucle principal
        do {

            //Muestra menu principal
            do {
                town.showMenu();
                menu1 = lector.nextInt();
                lector.nextLine();
            } while (menu1 < 0 || menu1 > 4);


            switch (menu1) {
                case 1:
                    Patient p= new Patient(askForPatient());
                    town.newPatient(p);
                    break;
                case 2:

                    checkPatient();
                    break;
                case 3:
                    //menu de consultas
                    menu2 = showMenuConsultas();
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
                    1 break;
                case 4:
                    alta();
                case 0:
                    System.out.println("Hasta luego Lucas");
            }
        } while (menu1 != 0);
    }

    private Patient askForPatient(){

        int sip;
        String name;
        char gender;
        int age;
        String psymtoms;
    }
}

