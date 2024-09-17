class Add{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a,double b){
        return a+b;
    }
}
public class methodOverloading {
    public static void main(String[]args){
        Add numbers = new Add();
        System.out.println("Adding two numbers:"+numbers.add(10,20));
        System.out.println("Adding three numbers:"+numbers.add(10,20,30));
        System.out.println("Result:"+numbers.add(4.5,5.4));
    }
}
//eventhough all the methods here were named as add they perform different tasks based on the input given