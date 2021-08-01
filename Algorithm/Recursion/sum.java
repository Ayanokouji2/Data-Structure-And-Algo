package Java.Algorithm.Recursion;

public class sum{
    static int summing(int n){
        if(n==1) return 1;
        
        return n+summing(n-1);
    }
    public static void main(String[] args) {
        int s=5;
        System.out.println("Sum : "+summing(s));
    }
}