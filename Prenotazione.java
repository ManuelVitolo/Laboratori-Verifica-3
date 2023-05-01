public class Prenotazione{
	private int giorno;
	private String mese;
	private int anno;
	private int ora;
	private Laboratorio lista[];


	public Prenotazione(int giorno,String mese, int anno, int ora){
		setGiorno(giorno);
		setMese(mese);
		setAnno(anno);
		setOra(ora);

	}
	public String getGiorno(){
		return giorno;
	}
	public void setGiorno(int giorno){
		this.giorno=giorno;
	}
	public String getMese(){
		return mese;
	}
	public void setMese(String mese){
		this.mese=mese;
	}
	public float getAnno(){
		return anno;
	}
	public void setAnno(int anno){
		this.anno=anno;
	}
	public float getOra(){
		return ora;
	}
	public void setOra(int ora){
    this.ora=ora;
	}
}
