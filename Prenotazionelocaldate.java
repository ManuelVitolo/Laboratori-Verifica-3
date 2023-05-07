import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter; 
public class Prenotazione{
	private int giorno;
	private int mese;
	private int anno;
	private int ora;
	private int min;


	public Prenotazione(int giorno,int mese, int anno, int ora, int min){
		setGiorno(giorno);
		setMese(mese);
		setAnno(anno);
		setOra(ora);
		setMin(min);
	}
	public int getGiorno(){
		return giorno;
	}
	public void setGiorno(int giorno){
		this.giorno=giorno;
	}
	public int getMese(){
		return mese;
	}
	public void setMese(int mese){
		this.mese=mese;
	}
	public float getAnno(){
		return anno;
	}
	public void setAnno(int anno){
		this.anno=anno;
	}
	public int getOra(){
		return ora;
	}
	public void setOra(int ora){
    this.ora=ora;
	}
	public int getMin(){
		return ora;
	}
	public void setMin(int min){
    this.min=min;
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


Prova con Main
import java.util.Scanner;
import java.io.InputStream;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;
public class Prova{
public static void Prova(String[]args){
	int giorno;
	int mese;
	int anno;
	int ora;
	int min;
	Scanner sc=new Scanner(System.in);
	System.out.println("Inserisci giorno");
	giorno =sc.nextInt();
	System.out.println("Inseridci mese");
	mese =sc.nextInt();
	System.out.println("Inseridci anno");
	anno =sc.nextInt();
	System.out.println("Inseridci ora");
	ora =sc.nextInt();
	System.out.println("Inseridci minuti");
	min =sc.nextInt();
	Prenotazione p=new Prenotazione(giorno, mese, anno, ora, min);
	p.formatta();
	
}


}

