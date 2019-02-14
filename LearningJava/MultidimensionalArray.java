public class MultidimensionalArray{
    public static void main(String[] args){
        int[] values = {1, 3, 5, 56};
        System.out.println(values[2]);
        int[][] grid = {
            {1, 3, 5, 7},
             {2, 4, 6},
             {3, 1, 2, 5, 9}
        };
        // row then column
        System.out.println(grid[1][1]);

        String[][] texts = new String[2][3];

        System.out.println(texts[0][1]);
        texts[0][1] = "hi";
        System.out.println(texts[0][1]);

        Person person1 = new Person();
        person1.name = "Anthony Scales";
        person1.age = 37;

        //person1.speak();

        int years = person1.calculateYearsToRetirement();

        System.out.println("Years till retirement " + years);

        int age = person1.getAge();
        String name = person1.getName();

        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);

        Person person2 = new Person();
        person2.name = "LaTasha Jones";
        person2.age = 35;

        for(int row=0; row<grid.length; row++){
            for(int col=0; col<grid[row].length; col++){
                System.out.println(grid[row][col] + "\t");
            }
            System.out.println();
        }
    }
}

class Person{
    // Instance variables( data or "state")
    String name;
    int age;


    //classes can contain
    //1. data
    //2. Subroutines (methods)
    void speak(){
        System.out.println("Hello, my name is " + this.name);
    }

    int calculateYearsToRetirement(){
        int yearsLeft = 65 - age;
        return yearsLeft;
    }

    int getAge(){
        return age;
    }

    String getName(){
        return name;
    }
}
