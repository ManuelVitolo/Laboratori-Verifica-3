/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classi;

/**
 *
 * @author Alunno
 */
public class Classi {

    private Classe [] lista;
    private int i=0;
    public Classi(){
       lista=new Classe[100];
    }
     public Classe [] getLista(){
        return lista;
     }
     public void setLista(Classe[] lista){
        this.lista=lista;
    }
    public void aggLab(Classe classe){
        this.lista[i]=Classe;
        i++;
    }    
    
    }
    

