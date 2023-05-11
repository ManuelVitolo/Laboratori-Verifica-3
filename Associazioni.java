/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package associazioni;

/**
 *
 * @author Alunno
 */
public class Associazioni {

     private Associazione [] associ;
    private int i=0;
    public Associazioni(){
       associ=new Associazione[100];
    }
     public Associazione [] getassoci(){
        return associ;
     }
     public void setAssoci(Associazione[] associ){
        this.associ=associ;
    }
    public void aggAs(Associazione associazione){
        this.associ[i]=Associazione;
        i++;
    }    
    
}
