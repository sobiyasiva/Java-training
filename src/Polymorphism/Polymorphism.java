package Polymorphism;
class Animal {
    public void animalSound() {
      System.out.println("The animal makes a sound");
    }
  }
  class Pig extends Animal {
    public void animalSound() {
      System.out.println("The pig says: wee wee");
    }
  } 
  class Dog extends Animal {
    public void animalSound() {
      System.out.println("The dog says: bow wow");
    }
  }
public class Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); 
        Animal myPig = new Pig();  
        Animal myDog = new Dog();  
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}

//function automatically finds even if we give the same name for different functions.
//Example-analyzing the number of arguments we given the function will automatically finds and displays the result