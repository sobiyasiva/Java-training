package Abstraction;
public class Abstract { 
}
abstract class Animal {
    public abstract void animalSound();
    public void sleep() {
      System.out.println("Zzz");
    }
  }
  class Pig extends Animal {
    public void animalSound() {
      System.out.println("The pig says: wee wee");
    }
  } 
  class Main {
    public static void main(String[] args) {
      Pig myPig = new Pig(); 
      myPig.animalSound();
      myPig.sleep();
    }
  }
  
  //abstract method should be inside the abstract class
  //abstract method should not have body
  //in abstract function all the child class should overwrite abstract function