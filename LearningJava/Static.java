class Thing{
    //final is java's version of constant, you can't change it
    public final static int LUCKY_NUMBER = 7;
    //instance variables
    public String name;

    public static int count = 0;
    
    public int id;

    public Thing(){

        id = count;
        count++;
    }

    //static variable
    public static String description;

    //instance method
    public void showName(){
        System.out.println("Object id:" + id + ", " + description + ":" + name);
    }
    //static variables exist before you've even created any object
    public static void showInfo(){
        System.out.println(description);
    //wont work: System.out.println(name);
    }
}

public class Static{
    public static void main(String[] args){
        Thing.description = "I am a thing";

        Thing.showInfo();
        System.out.println("Before creating objects, count is: " + Thing.count);
        System.out.println(Thing.description);
        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        System.out.println("After creating objects, count is: " + Thing.count);

        thing1.name = "Bon";
        thing2.name = "Sue";

        thing1.showName();
        thing2.showName();

        System.out.println(Math.PI);

        //Math.PI = 3;

        System.out.println(Thing.LUCKY_NUMBER);


    }
}