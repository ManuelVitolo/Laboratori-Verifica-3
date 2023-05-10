public class Associazione{
    private int anno;
    private String sezione;
    private String indirizzo;
    private String materia;
    public Associazione(int anno,String sezione,String indirizzo,String materia){
        setAnno(anno);
        setSezione(sezione);
        setIndirizzo(indirizzo);
        setMateria(materia);
    }
    public void setAnno(int anno){
    this.anno=anno;}
      
    public void setSezione(String sezione){
    this.sezione=sezione;} 
    
    public void setIndirizzo(String indirizzo){
    this.indirizzo=indirizzo;} 
    
    public void setMateria(String materia){
    this.materia=materia;} 
    
    public int getAnno(){
        return anno;}
    
    public String sezione(){
        return sezione;}
        
    public String indirizzo(){
        return indirizzo;}
        
    public String materia(){
        return materia;}
    
}
