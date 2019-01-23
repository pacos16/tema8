package com.pacosignes.tema8.ex7a;



public class DataBase {

    private String townName;
    private int numPatients;
    private int databaseSize;
    private int dailyPatients;
    private Patient[] patientsDB;
    private Attention[][] attentionsDB;

    public DataBase(String townName, int numPatients, int databaseSize, int dailyPatients) {
        this.townName = townName;
        this.numPatients = numPatients;
        this.databaseSize = databaseSize;
        this.dailyPatients = dailyPatients;

        patientsDB=new Patient[numPatients];
        attentionsDB= new Attention[databaseSize][dailyPatients];
    }

    //metodos de la classe

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
    public void showMenuConsultas(){
        System.out.println("*******************");
        System.out.println("*****Consultas*****");
        System.out.println("*******************");
        System.out.println("1.Por Sip");
        System.out.println("2.Por fechas");
        System.out.println("3.Estadisticas");
        System.out.println("4.Mostrar historico mensual");
    }

    /**
     *
     * @param sip Recives a sip and looks for it in the array checking nulls before.
     * @return if it finds it, retur position if dont return -1.
     */
    public int lookForBySip(int sip){

        for(int i =0;i<patientsDB.length;i++){
            if(patientsDB[i]!= null && patientsDB[i].getSip()==sip){
                return i;
            }
        }
        return -1;

    }
    public boolean newPatient(Patient p){
        boolean isCorrect=true;

    }

    /**
     * Esta es la funcion encargada de reescalar el array para que augmente su tamanyo.
     * Esta funcion es privada ya que solo puede ser llamada desde el metodo newPatient.
     */
    private void arrayRescale(){
        numPatients*=2;
        Patient[] patientsDBAux=new Patient[numPatients];
        for(int i =0; i<patientsDB.length;i++){
            patientsDBAux[i]=patientsDB[i];
        }
        patientsDB=patientsDBAux;
    }

}
