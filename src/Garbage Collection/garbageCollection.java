
public class garbageCollection {
    public static void main(String[]args){
        garbageCollection obj1=new garbageCollection();
        garbageCollection obj2=new garbageCollection();
        obj1=null;
        obj2=null;
        System.gc();
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
             e.printStackTrace();
        }
       System.out.println("End of main");
    }
}
