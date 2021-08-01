package Java.Algorithm.Recursion;

public class SumDigit {
    static int sum(int n){
        if(n==0) return 0;
        return n%10 + sum(n/10);
    }
    static int square_sum(int n){
        if(n==0) return 0;
        return (int) Math.pow(n%10,2) + square_sum(n/10);
    }
    public static void main(String[] args) {
        System.out.println(sum(121));
        System.out.println(square_sum(121));
    }
}
