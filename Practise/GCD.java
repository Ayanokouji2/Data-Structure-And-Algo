package Java.Practise;

public class GCD {
    static int getGCD(int a , int b){
        if(b==0)return a;
        System.out.println("a-->"+a+" b-->"+b );
        return getGCD(b,a%b);
    }
    public static void main(String[] args) {
        System.out.println("Answer --> "+getGCD(24,60));
    }
}
