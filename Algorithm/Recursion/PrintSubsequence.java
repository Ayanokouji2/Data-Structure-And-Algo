package Java.Algorithm.Recursion;

public class PrintSubsequence{

    static void printSS(String str,String ans){
        if(str.length() ==0){
            System.out.print(ans+"\s");
            return;
        }
        char ch = str.charAt(0);
        String Ans = str.substring(1);
        printSS(Ans,ans+ch);
        printSS(Ans,ans+"");
        

    }

    public static void main(String[] args) {
        String str = "abc";
        printSS(str,"");
    }
}