class math{
    public static int add(int a,int b){
        return a+b;
    }
}
public class Static {
    public static void main(String[]args){
        int sum=math.add(3,4);
        System.out.println(sum);
    }
}
//static-without creating objects