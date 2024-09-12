public class Methods {
   public static void main(String[]args) {
    addNumbers(3,4);
      String name="Sobi";
      int age=10;
      greet(name,age);
      sayHello();//method calling
   }
   static void sayHello(){
    System.out.println("Hello");
   }
   static void greet(String name,int age){
    System.out.println("Hello "+name+" your age is:"+age);
   }
   static void addNumbers(int a,int b){
    // int sum=a+b;
    System.out.println(a+b);
   }
}
