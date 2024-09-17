class Animal{
    void sound(){
        System.out.println("The animal makes a sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("The dog barks");
    }
}
public class methodOverriding {
    public static void main(String[]args){
        Animal myAnimal=new Animal();
        myAnimal.sound();
        Dog myDog=new Dog();
        myDog.sound();
    }
}
//inheritance is needed for method overriding
//here,we can change the methods from the paren class and use it in the child class