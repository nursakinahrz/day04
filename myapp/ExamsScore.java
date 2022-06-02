package myapp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ExamsScore {
    
    public static void main(String[]args) throws FileNotFoundException, IOException {


        Reader reader = new FileReader("/Users/nursakinah/Downloads/exams.csv");
        BufferedReader br = new BufferedReader(new FileReader("/Users/nursakinah/Downloads/exams.csv"));
        
        String line = "abc";
        line = line.replaceAll(",", "+");
        int lineNum = 0;

        while ((line!=null)) {
            line = br.readLine();
            lineNum++;
            System.out.printf("%d: %s\n", lineNum, line);
        }


        reader.close();
        br.close();





    }
}
