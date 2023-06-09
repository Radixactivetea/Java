public class Method {
    /*static means that the method belongs to the Main class and not an object of the Main class. 
    You will learn more about objects and how to access methods through objects later in this tutorial.*/
    static void myMethod() { 
        System.out.println("I just got executed!");
    }

    static void myMethod2(String name){
        System.out.println(name + " Paul");
    }

    static void myMethod3(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

    static int myMethodReturn(int x) {
        return 5 + x;
    }

    static int sum(int start, int end) { //recursion 
        if (end > start) {
          return end + sum(start, end - 1);
        } else {
          return end;
        }
    }

    //overloading method
    static int plusMethod(int x, int y) {
        return x + y;
      }  
      static double plusMethod(double x, double y) {
        return x + y;
      }

    
    public static void main(String[] args) {
        myMethod();
        myMethod2("Jean");
        myMethod3("Jenny", 31);
        System.out.println(myMethodReturn(10));

        // Code here CANNOT use x

    { // This is a block

        // Code here CANNOT use x
  
        int x = 100;
  
        // Code here CAN use x
        System.out.println(x);
  
      } // The block ends here
  
    // Code here CANNOT use x

    int result = sum(5, 10);
    System.out.println(result);

    int myNum1 = plusMethod(8, 5);
    double myNum2 = plusMethod(4.3, 6.26);
    System.out.println("int: " + myNum1);
    System.out.println("double: " + myNum2);
    
  
    }
}
