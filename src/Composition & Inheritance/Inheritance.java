class Dad{
    int money=2000;
}
class son extends Dad{

}
public class Inheritance {
    public static void main(String[]args){
    son s1=new son();
    System.out.println(s1.money);
    }
}
//son can access the money from dad -inheritance