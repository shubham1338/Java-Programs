package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ThrowsEg {
    void readFile() throws FileNotFoundException {
        FileOutputStream file=new FileOutputStream("e://abc.txt");
    }

    public static void main(String[] args) {

        try{
           ThrowsEg eg=new ThrowsEg();
           eg.readFile();
        }
        catch (FileNotFoundException e){
            System.out.println("file not found");
        }
    }
}
