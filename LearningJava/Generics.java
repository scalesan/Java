import java.util.ArrayList;
import java.util.HashMap;

public class Generics{
    public static void main(String[] args){

        ArrayList<String> strings = new ArrayList<String>();
        strings.add("cat");   
        strings.add("dog");
        strings.add("bird");

        String animal = strings.get(2);
        System.out.println(animal);

        /////// There can be more than one type argument ///////
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        ///////// Java 7 Style ////////
        ArrayList<Animal> someList = new ArrayList<>();
    }
}