package application.services;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class DatabaseFinder {
  
    
    public static void databseFinder(String url) throws FileNotFoundException{

        Scanner scanner = new Scanner(new FileReader(url)).useDelimiter("\\n");

        while (scanner.hasNext()) {
            System.out.println( scanner.next() );
        }

    }
    
    
}
