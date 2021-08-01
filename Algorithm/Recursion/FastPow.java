package Java.Algorithm.Recursion;

import java.util.*;

public class FastPow{

    static int pow(int x, int y){
        if(y==0) return 1;

        if(y%2==0) return pow(x*x, y/2);
        
        else return x*pow(x,y-1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("The num to pow");
        int num = in.nextInt();
        System.out.println("Enter the pow");
        int power = in.nextInt();
        System.out.println("Ans: "+pow(num,power));
        in.close();
    }
}