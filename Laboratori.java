public class Laboratori {
    private Laboratorio [] lista;
    private int i=0;
    public Laboratori(){
       lista=new Laboratorio[100];
    }
     public Laboratorio [] getLista(){
        return lista;
     }
     public void setLista(Laboratorio[] lista){
        this.lista=lista;
    }
    public void aggLab(Laboratorio laboratorio){
        this.lista[i]=laboratorio;
        i++;
    }    
    
    }

