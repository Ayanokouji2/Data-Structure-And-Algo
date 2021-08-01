package Java.Algorithm.Recursion;

import java.util.ArrayList;
import java.util.List;

public class KeyPadWord {

    static String[] codes = {"/.","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static List<String> keyWord(String str){
        if(str.length()==0){
            List<String> bcase = new ArrayList<String>();
            bcase.add("");
            return bcase;
        }
        char c = str.charAt(0);
        String ros = str.substring(1);
        List<String> rres = keyWord(ros);
        List<String> ans = new ArrayList<String>();
        int num = Integer.valueOf(c);
        String word = codes[num-'0'];
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            for(String ad:rres){
                ans.add(ch+ad);
            }
        }
        System.out.println("List size -->"+ans.size()+" \s");
        return ans;
    }

    public static void main(String[] args) {
        String str = "26";
        // char c=str.charAt(0);
        // int num = (int)(c-'0'); //!without minusing zero from it the ans was its ascii value but after minusing it return its original value(without typecasting).
        // System.out.println(num);
        System.out.println(keyWord(str));
    }
}
