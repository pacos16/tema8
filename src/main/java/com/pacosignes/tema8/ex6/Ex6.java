package com.pacosignes.tema8.ex6;


import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        int menu1;
        Scanner lector = new Scanner(System.in);

        System.out.println("***Gestion bicicletas***");
        System.out.println("1.Anyadir bicicletas");
        System.out.println("2.Vender bicicletas");
        System.out.println("3.Consultar bicicletas");
        System.out.println("3.Consultar stock");
        System.out.println("-------------------------");
        System.out.println("0. Salir");


        menu1=lector.nextInt();
        lector.nextLine();


        switch (menu1){
            case 0:
                System.out.println("Hasta luego");
                break;
            case 1:
                break;
        }

    }




}
