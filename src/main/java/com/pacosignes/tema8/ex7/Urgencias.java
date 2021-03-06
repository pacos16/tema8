package com.pacosignes.tema8.ex7;
public class Urgencias {

    private String townName;
    private int numPacientes;
    private int databaseSize;
    private int dailyPatients;
    private Paciente[] waitingList;
    private Paciente[][] dataBase;


    public Urgencias(int numPacientes, int databaseSize, int dailyPatients){
        this.numPacientes=numPacientes;
        this.databaseSize=databaseSize;
        this.dailyPatients=dailyPatients;

        waitingList=new Paciente[numPacientes];
        dataBase=new Paciente[databaseSize][dailyPatients];
    }



    //metodos


    public void showMenu(){

        System.out.println("*************************");
        System.out.println("********Urgencias********");
        System.out.println("*************************");
        System.out.println("1.Nuevo Paciente");
        System.out.println("2.Atender Paciente");
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
    public void newPatient(Paciente p){
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
        Paciente[] waitingListAux=new Paciente[numPacientes];
        for(int i =0; i<waitingList.length;i++){
            waitingListAux[i]=waitingList[i];
        }
        waitingList=waitingListAux;
    }


    public boolean isBeingAttended(int sip){
        for(int i =0; i< dataBase.length;i++){
            for(int j =0; j<dataBase[0].length;j++){
                if(dataBase[i][j].getSip()==sip && !dataBase[i][j].isAlta()){
                    return true;
                }
            }
        }
        return false;
    }

    public int isWaiting(int sip){

        for (int i =0; i<waitingList.length;i++){
            if(waitingList[i] != null && sip==waitingList[i].getSip() && waitingList[i].getIsWaiting()){
                return i;
            }
        }
        return -1;

    }

    public Paciente getFromWLByPosition(int i){
        return waitingList[i];
    }
    public boolean insertInDB(Paciente p, int pos){
        int[] date;
        int[] date1;
        int i;
        for( i=0; i<dataBase.length;i++){
           date= dataBase[i][0].getEntryDate();
           date1=p.getEntryDate();
           if(date1[0]>=date[0] && date1[1]>=date[1] && date1[2]>=date[2]){
               int j;
               for( j=0;j<dataBase[0].length && dataBase[i][j]!=null;j++){

               }
               if(j==dataBase[0].length){
                   return false;
               }else{
                   dataBase[i][j]=p;
                   waitingList[pos].setIsWaiting(false);
                   return true;
               }


           }
           if(i==dataBase.length-1){

               Paciente[][] dataAux=new Paciente[databaseSize*2][dailyPatients];

               for(int k=0;k<dataBase.length;k++){
                   for (int l=0;l<dataBase[0].length;l++){
                       if(dataBase[k][l]!=null){
                           dataAux[k][l]=dataBase[k][l];
                       }
                   }
               }
               databaseSize*=2;
               dataBase=dataAux;
           }
        }
        return false;
    }
    public String lookForBySip(int sip){
        String todo=null;

        for(int i=0;i<dataBase.length;i++){
            for(int j=0;j<dataBase[0].length;j++){
                if (dataBase[i][j].getSip()==sip){
                    todo+=dataBase[i][j].toString1();
                }
            }
        }
        return todo;
    }

    public String lookForByDate(int[] date, int[]date2){
        String s=null;
        boolean condicion;
        for(int i =0;i<dataBase.length;i++){
            condicion=dataBase[i][0].getEntryDate()[0]<=date[0] && dataBase[i][0].getEntryDate()[0]>=date2[0] &&
                    dataBase[i][0].getEntryDate()[1]<=date[1] && dataBase[i][0].getEntryDate()[1]>=date2[1] &&
                    dataBase[i][0].getEntryDate()[2]<=date[0] && dataBase[i][0].getEntryDate()[2]>=date2[0];
            if(condicion){
                for(int j=0;j<dataBase[0].length && dataBase[i][j]!=null;j++) {

                    s +=dataBase[i][j].toString1();
                }
            }
        }
        return s;


    }





}
