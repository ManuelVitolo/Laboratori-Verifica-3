/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author Alunno
 */
   public class Laboratori {
    private String[] materie;
    private int i;
    private Laboratorio[] lista;

    public Laboratori(String []materie,int i,Laboratorio[] lista) {
        lista=new Laboratorio [10];
        
    }
    public Laboratorio[] getLista(){
        return lista;
    }
    public void setLista[](Laboratorio[]lista){
        this.lista=lista;
    }
    public Laboratorio getLaboratorio(int i){
        return lista[i];
    }
    public void setLaboratorio(Laboratorio laboratorio,int i){
        this.lista[i]=laboratorio;
    }

    public void setMateria(String[] materia) {
        this.materie = materia;
    }

    public void Materia(String materia) {
        String[] aggiungiMaterie = new String[materie.length + 1];
        for (int i = 0; i < materie.length; i++) {
            aggiungiMaterie[i] = materie[i];
        }
        aggiungiMaterie[aggiungiMaterie.length - 1] = materia;
        materie = aggiungiMaterie;
    }
    public int cercalaboratorio(String laboratorio){
        int piano=-1;
        for(int x=0;x<i;x++){
            if(nome.equals(materie[x])){
                piano=x;
            }
        }
        return piano;
    }
}

  


