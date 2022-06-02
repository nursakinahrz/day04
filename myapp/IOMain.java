package myapp;

import java.io.File;
import java.nio.file.Path;

// java IOMain <src> <dest>

public class IOMain {
    public static void main(String[] args) {

        Path p = Paths.get("/Users/nursakinah");
        
        //File object
        File f = p.toFile();

        //File object
        File hostfFile = new File("/Users/nursakinah");
        File etcDir = new File("/Users/nursakinah");
        File f = new File("/Users/nursakinah");
        System.out.printf("is directory? %");

    }
}
