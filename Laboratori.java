public class Laboratori {
    private Laboratorio [] lista;
    public Laboratori(Laboratorio [] lista){
        setLista(lista);
    }
     public Laboratorio [] getLista(){
        return lista;}
    
     private void setLista(Laboratorio[] lista) {
        this.lista=lista;
    }
    
    public void aggLab(){
        Laboratorio l1=new Laboratorio();
    }
}
