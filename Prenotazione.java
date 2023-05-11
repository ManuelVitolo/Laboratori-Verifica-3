import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter; 

public class Prenotazione{
    private LocalDateTime data;


	public Prenotazione( int giorno,int mese, int anno, int ora, int min){
            setData(giorno, mese, anno, ora, min);
           
	}
        public LocalDateTime getData(){
	return data;
	}
	public void setData(int giorno,int mese, int anno, int ora, int min){
	this.data=LocalDateTime.of(anno, mese, giorno , ora, min);  ;
	}

	public void formatta(){
		LocalDateTime datetime1 = LocalDateTime.of(anno, mese, giorno , ora, min);  
		  LocalDateTime datetime2 = datetime1.minusDays(100);  
		  System.out.println("Before Formatting: " + datetime2);  
		  DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");  
		  String formatDateTime = datetime2.format(format);   
		  System.out.println("After Formatting: " + formatDateTime );  
	}    
}
