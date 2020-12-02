package lecteur;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class lecteur {



public static void main(String args[]) {
    
    BufferedReader reader;
    boolean pasFini = true;
    int caractere;

    try {
        reader = new BufferedReader(
                new FileReader("test.txt"));

        while (pasFini) {
            caractere = reader.read();
 
            if (caractere != -1) { // ce n'est pas encore la fin du fichier
                System.out.print((char)caractere);
            } else {
                pasFini = false;
            }
        }

        reader.close();
    } catch (IOException ioe) {
        System.err.println(ioe);
        System.exit(1);
    }
}
}