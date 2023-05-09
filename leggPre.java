import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Verifica {
    public class BufferReaderExample {
    public static void main(String [] args) 
        throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Prenotazione.txt"));
        Prenotazioni ll=new Prenotazioni();
        String line = reader.readLine();
        while(line!=null) {
        System.out.println(line);
        line = reader.readLine();
        String[]u = line.split(";");
        String u1 = l[0];
        String u2 = l[1];
        String u3 = l[2]; 
      Prenotazioni u=new Prenotazione(u1,u2,u3);
        uu.aggPre(u);
    } 
    } 
    }
        
}
