public class StringBuilderFormatting{
    public static void main(String[] args) { 
        //Inefficient
        String info = "";
        info += "my name is Bob";
        info +=". ";
        info +="I am a builder.";

        System.out.println(info);


        //More Efficient.
        StringBuilder sb = new StringBuilder("");

        sb.append("My name is Anthony.");
        sb.append(" ");
        sb.append("I am a software engineer.");

        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();
        s.append("Hello pleased to meet you!")
         .append(" ")
         .append("What are you doing today?");

        System.out.println(s.toString());

        //////////// Formatting ////////////

        System.out.println("Here is some new text.\tTake a look.\nWhat do you think?");
        //printf allows formatting
        System.out.printf("Total Cost %-10d; quantity is %d\n", 5, 25);

        for(int i=0; i<20; i++){
            System.out.printf("%2d: %s\n", i, "Extra Text");
        }
        //Formatting floating point values
        System.out.printf("Total value: %.2f\n", 5.678737);
        System.out.printf("Total value: %.1f\n", 5.678737);
    }
}