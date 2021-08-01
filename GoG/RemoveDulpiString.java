package Java.GoG;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RemoveDulpiString {
    static String removeDuplicates(String str) {
        // code here
        Map<Character,Integer> x = new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            if(!x.containsKey(str.charAt(i)))x.put(str.charAt(i),1);
            else x.put(str.charAt(i),x.get(str.charAt(i))+1);
        }
        List<Character> sax = new ArrayList<Character>(x.keySet());
        StringBuilder s = new StringBuilder();
        for(int i=0;i<sax.size();i++){
            s.append(sax.get(i));
        }
        str = s.toString();
        return str;
    }
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(removeDuplicates(str));
    }
}
