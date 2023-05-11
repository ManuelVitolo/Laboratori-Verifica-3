/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.classe;

/**
 *
 * @author studente
 */
public class Classe {
    private String indirizzo;
    private String sezione;
    private int anno;


public Classe(String indirizzo,String sezione,int anno){
    setIndirizzo(indirizzo);
    setSezione(sezione);
    setAnno(anno);
   
}

public void setIndirizzo(String indrizzo){
    this.indirizzo=indirizzo;
}
public String getIndirizzo(){
    return indirizzo;
}
public void setSezione(String Sezione){
    this.sezione=sezione;
}
public String getSezione(){
    return sezione;
}
public void setAnno(int anno){
    this.anno=anno;
}
public int getAnno(){
    return anno;
}
  
}
