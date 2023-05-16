import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Main {
        public static Prenotazione creaPrenotazione(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Inserisci giorno, mese, anno, ora e minuti
della prenotazione");
        int giorno=sc.nextInt();
        int mese=sc.nextInt();
        int anno=sc.nextInt();
        int ora=sc.nextInt();
        int min=sc.nextInt();
        return new Prenotazione(giorno, mese, anno, ora, min);
    }
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
        Laboratori n=new Laboratori();
        Prenotazioni p=new Prenotazioni();
        int scelta;
        do{
            System.out.println("Premi 0 per uscire, 1 per creare
laboratori, 2 per vedere prenotazioni del docente, 3 per inserire una
data e vedere le prenotazioni fatte dagli altri di quel giorno");
            scelta=sc.nextInt();
            if(scelta==1){
            creaPrenotazione();
            }else if(scelta==2){
            p.stampaPre();
            }else if(scelta==3){

            }
        }while(scelta!=0);
    }
}
