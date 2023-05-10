import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeggLab {
    public class BufferReaderExample {
    public static void LeggLab(String [] args) 
        throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Laboratorio.txt"));
        Laboratori ll=new Laboratori();
        String line = reader.readLine();
        while(line!=null) {
        System.out.println(line);
        line = reader.readLine();
        String[] l = line.split(";");
        String l1 = l[0];
        String l2 = l[1];
        String l3 = l[2]; 
        Laboratorio l=new Laboratorio(l1,l2,l3);
        ll.aggLab(l);
    } 
    } 
    }
        
}
