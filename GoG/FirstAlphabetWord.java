package Java.GoG;

import java.util.*;

public  class FirstAlphabetWord {
    static class Alphabet{
    public String firstAlphabet(String s){
            String ans;
            StringBuffer S = new StringBuffer();
            S.append(s.charAt(0));
            for(int i=1;i<s.length();i++){
                if(s.charAt(i)==' '){
                    S.append(s.charAt(i+1));
                }
            }
            ans = S.toString();
            return ans;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = in.nextLine();
        Alphabet ap = new Alphabet();
        String dis = ap.firstAlphabet(str);
        System.out.println(dis);
        in.close();
    }
}
