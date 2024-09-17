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
public class Upcasting {
    public static void main(String[]args){
        Dog myDog=new Dog();
        Animal myAnimal=myDog;
        myAnimal.sound();
    }
}
//creating dog object
//storing dog object in the myAnimal variable
//upcasting is automatic