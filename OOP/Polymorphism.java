public class Polymorphism {
    public void animalSound() {
        System.out.println("The animal makes a sound");
      }
    }
    
    class Pig extends Polymorphism {
      public void animalSound() {
        System.out.println("The pig says: wee wee");
      }
    }
    
    class Dog extends Polymorphism {
      public void animalSound() {
        System.out.println("The dog says: bow wow");
      }
}
