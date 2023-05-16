import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter; 

public class Prenotazione{
    private LocalDateTime data;
    private Docente docente;
    private Classe classe;
    private Laboratorio laboratorio;
    
    public Prenotazione( int giorno,int mese, int anno, int ora, int min){
        setData(giorno, mese, anno, ora, min);
            
           
	}
        public LocalDateTime getData(){
	return data;
	}
	public void setData(int giorno,int mese, int anno, int ora, int min){
	this.data=LocalDateTime.of(anno, mese, giorno , ora, min);  
	}

	public void formatta(){
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");  
		String formatDateTime = data.format(format);   
		System.out.println("After Formatting: " + formatDateTime );  
	}    
}
