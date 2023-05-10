import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeggPre {
    public class BufferReaderExample {
    public static void LeggPre(String [] args) 
        throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Prenotazione.txt"));
        Prenotazioni uu=new Prenotazioni();
        String line = reader.readLine();
        while(line!=null) {
        System.out.println(line);
        line = reader.readLine();
        String[]u = line.split(";");
        String u1 = u[0];
        String u2 = u[1];
        String u3 = u[2]; 
      Prenotazioni u=new Prenotazione(u1,u2,u3);
        uu.aggPre(u);
    } 
    } 
    }
        
}
