package Generics;
class Box<T> {
    private T item;
    public void put(T item) {
        this.item = item;
    }
    public T get() {
        return item;
    }
}
public class Gener {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.put("Toy Car");
        System.out.println(stringBox.get());  
        Box<Integer> intBox = new Box<>();
        intBox.put(123);
        System.out.println(intBox.get());  
    }
}
