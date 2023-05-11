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

    private Classe [] elenco;
    private int i=0;
    public Classi(){
       elenco=new Classe[100];
    }
     public Classe [] getelenco(){
        return elenco;
     }
     public void setElenco(Classe[] elenco){
        this.elenco=elenco;
    }
    public void aggClas(Classe classe){
        this.elenco[i]=classe;
        i++;
    }    
    
    }
    

