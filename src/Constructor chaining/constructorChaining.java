public class constructorChaining {
    class Parent{
        Parent(){
        System.out.println("Parent content");
    }
}
    class Child extends Parent{
        Child(){
            this(7);
        System.out.println("Child 1");
    }
    Child(int number){
        super();
        System.out.println("Child 2"+number);
    }
}
}
//this keyword makes another child constructor to call first
//super keyword calls parent code
//so,first parent content will print
//second child 2 and third child 3 will print