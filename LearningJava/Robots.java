class Robot{
    public void speak(String text){
        System.out.println(text);
    }

    public void jump(int height){
        System.out.println("jumping " + height);
    }

    public void move(String direction, double distance){
        System.out.println("moving " + distance + " meters in direction " + direction);
    }
}
public class Robots{
    public static void main(String[] args){
        Robot sam = new Robot();
        sam.speak("Hi I'm Sam");
        sam.jump(20);
        sam.move("North", 24.34);
    }
}