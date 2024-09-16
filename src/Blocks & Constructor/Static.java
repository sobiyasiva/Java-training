public class Static {
    static{
        System.out.println("Runs only once when the class is loaded");
    }
    public static void main(String[]args){
        System.out.println("Program starts here");//no need objects here,only class is needed
    }
}
// static block code runs first and then the main program will run