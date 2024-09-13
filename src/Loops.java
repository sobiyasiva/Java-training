public class Loops {
    public static void main(String[]args){
        //loops are used when we need to repeat something multiple times
       int number=1;
       while(number<=5){
        System.out.println("Numberis : "+number);
        number++;
       }
       //for loop
       for(int a=1;a<=5;a++){
        System.out.println(a);
       }
       //do-while loop
       int b=1;
       do{
        System.out.println("Number "+b);
        b++;
       }while(b<=5);
    }
}
