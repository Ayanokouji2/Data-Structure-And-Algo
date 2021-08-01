package Java.Algorithm.Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSequenceString{

    public static List<String> SSS(String str){
        if(str.length()==0){
            List<String> llist = new ArrayList<String>();
            llist.add("");
            return llist;
        }
        char c = str.charAt(0);
        List<String> res = SSS(str.substring(1));
        List<String> ans = new ArrayList<String>();
        for(String s : res){
            ans.add(c+s);
        }
        for(String s : res){
            ans.add(""+s);
        }
        // String r = ans.toString(); when we need to return a string.
        return ans;
    }
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(SSS(str));    
    }
}