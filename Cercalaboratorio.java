/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cercalaboratorio;

/**
 *
 * @author studente
 */
public class Cercalaboratorio {

  public class Laboratorio {
    private String nome;
    private int posti;
    private String[] materie;
    private int i;

    public Laboratorio(String nome, int posti) {
        this.nome = nome;
        this.posti = posti;
    }

    public void setMaterie(String[] materie) {
        this.materie = materie;
    }

    public void aggiungiMateria(String materia) {
        String[] nuoveMaterie = new String[materie.length + 1];
        for (int i = 0; i < materie.length; i++) {
            nuoveMaterie[i] = materie[i];
        }
        nuoveMaterie[nuoveMaterie.length - 1] = materia;
        materie = nuoveMaterie;
    }

   public int cercalaboratorio(String laboratorio){
        int posti=-1;
        for(int x=0;x<i;x++){
            if(nome.equals(materie[x])){
                posti=x;
            }
        }
        return posti;
    }
}
}
