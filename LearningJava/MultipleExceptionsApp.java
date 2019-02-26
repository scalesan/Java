import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class MultipleExceptionsApp{
    public static void main(String[] args) {
        MultipleExceptions test = new MultipleExceptions();
        /*
        try{
            test.run();
        } catch(IOException e){
            e.printStackTrace();
        } catch(ParseException e){
            System.out.println("Couldn't parse command file");
        }*/

        /*


        try{
            test.run();
        }
        catch (IOException | ParseException e){
            e.printStackTrace();
        }
        */

        try{
            test.run();
        } catch(Exception e){

            e.printStackTrace();
        }
        
        try{
            test.input();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}