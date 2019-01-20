package com.pacosignes.tema8.ex7;
import java.util.Scanner;
public class Urgencias {

    private int numPacientes;
    private int databaseSize;
    private Paciente[] waitingList=new Paciente[numPacientes];
    private Paciente[][] dataBase=new Paciente[databaseSize][40];

    public static void main(String[] args) {
        int menu1;
        int menu2;
        Scanner lector= new Scanner(System.in);
        //Menu principal
        do{
            menu1=showMenu();
            switch (menu1){
                case 1:
                    newPatient();
                    break;
                case 2:
                    heal();
                    break;
                case 3:
                    //menu de consultas
                    menu2=showMenuConsultas();
                    switch (menu2){
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
        }while(menu1!=0);





    }
    //metodos


        public static int showMenu(){
            int num;
            do{
                System.out.println("*************************");
                System.out.println("********Urgencias********");
                System.out.println("*************************");
                System.out.println("1.Nuevo Paciente");
                System.out.println("2.Atender Paciente");
                System.out.println("3.Consultas");
                System.out.println("4.Alta medica");
                System.out.println("-------------------");
                System.out.println("0.Salir");
                num=lector.nextInt();
                lector.nextLine();

            }while(num<0 || num>4);

            return num;
        }

        public static void new Patient(){

    }

}
