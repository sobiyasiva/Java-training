public class primiviteTypecasting  {
    //converting one datatype to the other=primitive
    public static void main(String[]args){
    int num=7;
    double largeNum=num; 
    System.out.println(largeNum);

    double number=99.99;
    int smallNum=(int)number;//Here cannot convert double to int directly as the above
    System.out.println(smallNum);
    }
}
