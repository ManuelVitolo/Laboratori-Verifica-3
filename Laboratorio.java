/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio;

/**
 *
 * @author Alunno
 */
public class Laboratorio {
private String piano;
private String materia;

public Laboratorio(String piano,String materia){
    setPiano(piano);
    setMateria(materia);
   
}
public void setPiano(String piano){
    this.piano=piano;
}
public String getPiano(){
    return piano;
}

public void setMateria(String materia){
    this.materia=materia;
}
public String getMateria(){
    return materia;
}
  
    }