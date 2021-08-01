package Java.HackerRank;


class Solution{
public static int squares(int a, int b) {
        int newA = (int)Math.sqrt(a);
        int newB = (int)Math.sqrt(b);
        if(newA*newA >= a){newA--;return newB-newA;}
        else return newB-newA;
    }
}

public class SherlockSquares{
    public static void main(String[] args) {
        int ans =Solution.squares(26, 49);
        System.out.println((int)Math.sqrt(26));
        System.out.println( ans);
    }
}