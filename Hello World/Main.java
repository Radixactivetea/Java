public class Main {
        public static void main(String[] args) {
          System.out.println("Hello World");
          
          //print in same lane (println == \n)
          System.out.print("Hello World! ");
          System.out.print("I will print on the same line.");

          //string in 'S'
          System.out.println();
          String name = "John";
          System.out.println(name);

          /*final int myNum = 15;
          myNum = 20;  // will generate an error: cannot assign a value to a final variable*/

          //byte Stores whole numbers from -128 to 127
          byte myNum = 100;
          System.out.println(myNum);

          boolean isJavaFun = true;
          boolean isFishTasty = false;
          System.out.println(isJavaFun);     // Outputs true
          System.out.println(isFishTasty);   // Outputs false

          //casting
          int myInt = 9;
          double myDouble = myInt; // Automatic casting: int to double
      
          System.out.println(myInt);      // Outputs 9
          System.out.println(myDouble);   // Outputs 9.0

          double myDouble2 = 9.78d;
          int myInt2 = (int) myDouble; // Manual casting: double to int
      
          System.out.println(myDouble2);   // Outputs 9.78
          System.out.println(myInt2);      // Outputs 9

          //bitwise operator https://www.geeksforgeeks.org/bitwise-operators-in-java/

          //string length
          String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
          System.out.println("The length of the txt string is: " + txt.length());

          //change upper and lower case
          String text = "Hello World";
          System.out.println(text.toUpperCase());   // Outputs "HELLO WORLD"
          System.out.println(text.toLowerCase());   // Outputs "hello world"

          //to locate specific (the index)
          String teext = "Please locate where 'locate' occurs!";
          System.out.println(teext.indexOf("locate")); // Outputs 7

          //plus to string (name + name2)
          String firstName = "John ";
          String lastName = "Doe";
          System.out.println(firstName.concat(lastName));

          //add string n int 
          String x = "10";
          int y = 20;
          String z = x + y; // z will be 1020 (a String)
          System.out.println(z);
          
          //You can also use the concat() method to concatenate two strings:
          String firstName1 = "John ";
          String lastName1 = "Doe";
          System.out.println(firstName1.concat(lastName1));

          //math
          Math.max(5, 10);
          Math.min(5, 10);
          Math.sqrt(64);
          Math.abs(-4.7);
          Math.random(); //random between 0.0 too 1.0
          int randomNum = (int)(Math.random() * 101);  // 0 to 100
          System.out.println(randomNum);

          //ifelse statement
          if (20 > 18) {
            System.out.println("20 is greater than 18");
          }

          //another way to use ifelse (short)
          int time = 20;
          String result = (time < 18) ? "Good day." : "Good evening.";
          System.out.println(result);

          //switch statements
          int expression = 1;
          switch(expression) {
            case 1:
              // code block
              break;
            case 2:
              // code block
              break;
            default:
              // code block
          }

          //while loop
          int condition = 1;
          while (condition == 2) {
            // code block to be executed
          }

          //for loop
          for (int i = 0; i < 5; i++) {
            System.out.println(i);
          }
          String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
          for (String i : cars) {
          System.out.println(i);
          }

          //array
          String[] kereta = {"Volvo", "BMW", "Ford", "Mazda"};
          System.out.println(kereta[0]); // Outputs Volvo
          System.out.println(kereta.length); // Outputs 4
          for (String i : kereta) {
          System.out.println(i);
          }

          //Multidimensional Arrays
          int[][] myNombor = { {1, 2, 3, 4}, {5, 6, 7} };
          int num = myNombor[1][2];
          System.out.println(num); // Outputs 7
        }
}