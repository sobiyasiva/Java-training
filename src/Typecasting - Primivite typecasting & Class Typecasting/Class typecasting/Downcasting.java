class Animal{
    void sound(){
        System.out.println("Animals");
    }
}
    class Dog extends Animal{
        void bark(){
            System.out.println("Dog");
        }
}
public class Downcasting {
    public static void main(String[]args){
        Animal myAnimal=new Dog();
        Dog myDog=(Dog)myAnimal;
        myDog.bark();
    }
}
//Creating new dog object and store it in the myAnimal variable
//currently dog is treated as a animal so here downcasting should occurs
//simply write (dog)myAnimal to treat this animal as a dog again
