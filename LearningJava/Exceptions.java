import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Exceptions{
    public static void main(String[] args ) throws FileNotFoundException{
        try{
        openFile();
        } catch(FileNotFoundException e){
            //This message is too vague
            System.out.println("Could not open file");
        }
    }

    public static void openFile() throws FileNotFoundException{
        File file = new File("/test.txt");

        FileReader fr = new FileReader(file);

    }

}