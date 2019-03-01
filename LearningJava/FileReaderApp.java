import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.IOException;



public class FileReaderApp{
    public static void main(String[] args){
        File file = new File("test2.txtx");
        BufferedReader br = null;

        try{
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);

            String line;
            
            while((line = br.readLine()) != null){

            System.out.println(line);
            }


        } catch (FileNotFoundException e){
            System.out.println("File Not Found: " + file.toString());
        }
         catch(IOException e){
             System.out.println("Unable to read file: " + file.toString() );
         }

         finally{
            try{
                br.close();
                } catch (IOException e){
                    System.out.println("Unable to close file: " + file.toString());
                } catch(NullPointerException ex){
                   //File was probably never opened!
                }

         }
    }
}