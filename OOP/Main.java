class Main {
    public static void main(String[] args){

        //Simple
        Simple myObj1 = new Simple();  // Object 1
        Simple myObj2 = new Simple();  // Object 2
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);

        //attributes
        Attributes myObj3 = new Attributes();
        System.out.println("Name: " + myObj3.fname + " " + myObj3.lname);
        myObj3.age = 23;
        System.out.println("Age: " + myObj3.age);

        //Class Method
        ClassMethod myCar = new ClassMethod();     // Create a myCar object
        myCar.fullThrottle();      // Call the fullThrottle() method
        myCar.speed(200);          // Call the speed() method
    
        //Constructor   
        Constructor myCar1 = new Constructor(1969, "Mustang");
        System.out.println(myCar1.modelYear + " " + myCar1.modelName);

        //abstractions
        // create an object of the Student class (which inherits attributes and methods from Main)
        // Student john = new Student();

        // System.out.println("Name: " + john.fname);
        // System.out.println("Age: " + john.age);
        // System.out.println("Graduation Year: " + john.graduationYear);
        // john.study(); // call abstract method

        //Encapsulation
        Encapsulation myObj = new Encapsulation();
        myObj.setName("John"); // Set the value of the name variable to "John"
        System.out.println(myObj.getName());

        //Polymorphism
        Polymorphism myAnimal = new Polymorphism();  // C   reate a Animal object
        Polymorphism myPig = new Pig();  // Create a Pig object
        Polymorphism myDog = new Dog();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
