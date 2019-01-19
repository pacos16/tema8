package com.pacosignes.tema8.ex7;

public class Urgencias {

    private int numPacientes;
    private int databaseSize;
    private Paciente[] waitingList=new Paciente[numPacientes];
    private Paciente[][] dataBase=new Paciente[databaseSize][40];

    public static void main(String[] args) {
        int menu1;
        int menu2;
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
                    break;
                case 4:
                    alta();
                case 0:
                    System.out.println("Hasta luego Lucas");
            }
        }while(menu1!=0);


        //metodos


        public int showMenu(){

        }

    }



}
