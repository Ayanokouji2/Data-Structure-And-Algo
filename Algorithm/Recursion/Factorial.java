package Java.Algorithm.Recursion;

public class Factorial {
    static int fact(int  n){
        
        if(n==1) return 1 ;
         
        n=n*fact(n-1);
        return n;
    }
    public static void main(String[] args) {
        System.out.println(fact(4));
       
    }
}
