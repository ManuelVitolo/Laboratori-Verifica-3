public class Prenotazioni{
	private Prenotazione array[]
	private int i=0;
	
	public Prenotazioni(Prenotazione array[]){
		array=new Prenotazione[10]
	}
	
    public Prenotazione[] getArray(){
        return array;
    }
    public void setArray(Prenotazione[] array){
        this.array=array;
    }
    public Prenotazione getPrenotazione (int i){
        return array[i];
    }
    public void setPrenotazione(Prenotazione prenotazione, int i){
        this.array[i]=prenotazione;
    }
    public void aggPre(Prenotazione prenotazione){
    this.array[i]=prenotazione;
        i++;
    }
}
