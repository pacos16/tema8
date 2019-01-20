package com.pacosignes.tema8.ex7;
public class Urgencias {

    private String townName;
    private int numPacientes;
    private int databaseSize;
    private int dailyPatients;
    private Patient[] waitingList=new Patient[numPacientes];
    private Patient[][] dataBase=new Patient[databaseSize][dailyPatients];

    //metodos


    public void showMenu(){

        System.out.println("*************************");
        System.out.println("********Urgencias********");
        System.out.println("*************************");
        System.out.println("1.Nuevo Patient");
        System.out.println("2.Atender Patient");
        System.out.println("3.Consultas");
        System.out.println("4.Alta medica");
        System.out.println("-------------------");
        System.out.println("0.Salir");
    }

    /**
     * Esta funcion recibe un Objeto de la clase paciente y lo mete en la cola de espera
     * En caso de que el array se quede pequeño, crea otro con el doble de tamaño con la funcion arrayRescale.
     * @param p paciente p construido con el constructor 1 de obtencion de datos.
     *
     */
    public void newPatient(Patient p){
        int i=0;
        while(i<waitingList.length && !(waitingList[i] == null || !waitingList[i].getIsWaiting())){
            i++;
        }
        if (i==waitingList.length){
            arrayRescale();
        }

        if (waitingList[i] == null || !waitingList[i].getIsWaiting()) {
            waitingList[i] = p;
        }

    }

    /**
     * Esta es la funcion encargada de reescalar el array para que augmente su tamanyo.
     * Esta funcion es privada ya que solo puede ser llamada desde el metodo newPatient.
     */
    private void arrayRescale(){
        numPacientes*=2;
        Patient[] waitingListAux=new Patient[numPacientes];
        for(int i =0; i<waitingList.length;i++){
            waitingListAux[i]=waitingList[i];
        }
        waitingList=waitingListAux;
    }

    public void checkPatient(Patient p){




    }


}
