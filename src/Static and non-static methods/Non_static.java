class Dog{
    String name;
    public void bark(){
        System.out.println(name+" dog barks");
    }
}
public class Non_static {
    public static void main(String[]args){
        Dog myDog=new Dog();
        myDog.name="Buddy";
        myDog.bark();
    }
}
//non-static=using objects