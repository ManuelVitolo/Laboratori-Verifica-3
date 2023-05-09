import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Verifica {
    public class BufferReaderExample {
    public static void main(String [] args) 
        throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Docente.txt"));
        Docenti ll=new Docenti();
        String line = reader.readLine();
        while(line!=null) {
        System.out.println(line);
        line = reader.readLine();
        String[] f = line.split(";");
        String f1 = l[0];
        String f2 = l[1];
        String f3 = l[2]; 
        Docente f=new Docente(f1,f2,f3);
        ff.aggDoc(f);
    } 
    } 
    }
        
}
