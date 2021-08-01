package Java.College.Thread;
class B extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("B"+i);
        }
        System.out.println("inside B thread");
    }
}

class A extends B{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("A"+i);
        }
        System.out.println("inside A thread");
    }
}



public class ThreadTest {
    public static void main(String[] args) {
        
        A object = new A();
        // B obj = new B();
        new B().start(); //Both creating object and calling the start method.
        object.start();
    }
}
