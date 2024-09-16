public class Tokens {
    public static void main(String[]args){
        int a=10; //number literal
        double b=5000.50;  //double literal
        char c ='A';   //character literal
        String d="fruits";    //string literal   
        System.out.println("The number is:"+a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        //operators
        int x=5,y=10;
        System.out.println("sum:"+(x+y));
        System.out.println("difference:"+(x-y));
        boolean isEqual=(x==y);//checks whether x and y are equal and stores the result in isEqual
        System.out.println("Are x and y equal?"+isEqual);
    }
}
 