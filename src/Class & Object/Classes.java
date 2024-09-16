public class Classes  {
    public static void main(String[]args){
        //creating new object for the class car,object name is myCar
       car myCar=new car(); 
       myCar.color="Red";
       myCar.model="Audi"; //setting the properties value
       System.out.println("Car color is:"+myCar.color);
       System.out.println("Car model is:"+myCar.model);
       myCar.drive();//calling the action here
    }
}
//classname
    class car{
        String color;//properties
        String model;
        void drive(){//action
            System.out.println("The car is driving!");
        }
    }

