public class Conditional {
    public static void main(String[]args){
        int a=7;
        if(a<4){//only code runs inside if the condition is true
            System.out.println("Success");
        }else{
            System.out.println("Failure");
        }
        int marks=85;
        if(marks>=90){
            System.out.println("Grade A");
        }
        else if(marks>=80){
            System.out.println("Grade B");
        }
        else{
            System.out.println("You need to study harder");
        }
        int day=3;
        switch (day){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("It's an another day");
            break;
        }

    }
}
