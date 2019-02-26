import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class read{
    public static void main(String[] args){
        String fileName = "C:/Users/LJC0QBF/Desktop/read.txt";

        File textFile = new File(fileName);

        try{
        Scanner in = new Scanner(textFile);

        int value = in.nextInt();
        System.out.println("Read Values: " + value);
        
        int count = 2;
        while(in.hasNextLine()){
               String line = in.nextLine(); 
               System.out.println(count + ": " + line);
               count++;
            } 
            in.close();
        } catch  (FileNotFoundException e){
            e.printStackTrace();
        }
    } 
}