package com.pacosignes.tema8.ex7a;
import java.util.Scanner;

public class View {
    private static Scanner lector = new Scanner(System.in);
    private static DataBase dB;

    public static void main(String[] args) {
        int menu1;
        int menu2;
        int numPatients;
        String name;
        int databaseSize;
        int waitingList;
        int dailyPatients;
        System.out.println("Bienvenido a la base de datos de urgencias.");
        System.out.println("Introduzca el nombre del pueblo en el que nos encontramos");
        name=lector.nextLine();
        System.out.println("Dime el tamanyo inicial de la base de datos de pacientes");
        numPatients=lector.nextInt();
        lector.nextLine();
        System.out.println("Dime la cantidad de dias que quieres guardar incialmente en la base de datos de atenciones");
        databaseSize=lector.nextInt();
        lector.nextLine();
        System.out.println("Dime la cantidad de pacientes que podemos atender al dia");
        dailyPatients=lector.nextInt();
        lector.nextLine();

        dB=new DataBase(name,numPatients,databaseSize,dailyPatients);

        System.out.println("Base de datos creada con exito");



        do{
            //Muestra menu principal
            do {
                dB.showMenu();
                menu1 = lector.nextInt();
                lector.nextLine();
            } while (menu1 < 0 || menu1 > 4);

            int sip;
            switch (menu1){
                case 1:
                    int pos;

                    Patient p;
                    sip=askSip();
                    pos=dB.lookForBySip(sip);
                    if(pos>=0){
                        p=dB.getPatient(pos);
                    }else{
                        //nuevoPaciente()
                    }
                    //attendPatient1(p)
                    break;
                case 2:
                    do {
                        sip = askSip();
                    }while(!dB.isBeeingAttended(sip));

                    //attend patient

                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }while(menu1!=0);



    }
    private static int askSip(){
        int sip;
        do {
            System.out.println("Dime un sip");
            sip=Integer.parseInt(lector.nextLine());
            if(sip<10000000 ||  sip>99999999){
                System.out.println("no es correcto introduzca de nuevo");
            }
        }while(sip<10000000 ||  sip>99999999);


    }

}
