public class Exception{
    public static void main(String[] args) {
        try {
            int number = 10;
            int divisor = 0;
            int result = number / divisor;  // Causes exception
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            System.out.println("This will always run, even if there’s an error.");
        }
    }
}

//finally runs even if error occurs or not occurs