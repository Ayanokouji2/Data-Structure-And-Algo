package Java.LeetCode;

import java.util.*;

public class IsomorphicString{//Not correct for all test cases.
    public static boolean isIsomorphic(String s, String t) {
        Map<Character,Integer> First = new LinkedHashMap<>();
        Map<Character,Integer> Second = new LinkedHashMap<>();
        
        for(int i=0;i<s.length();i++){
            if(First.containsKey(s.charAt(i))) First.put(s.charAt(i),First.get(s.charAt(i))+1);
            else First.put(s.charAt(i),1);
        }
        
        for(int i=0;i<t.length();i++){
            if(Second.containsKey(t.charAt(i))) Second.put(t.charAt(i),Second.get(t.charAt(i))+1);
            else Second.put(t.charAt(i),1);
        }
        
        boolean same = false;
        List<Integer> num = new LinkedList<>();
        for(Map.Entry<Character,Integer> entry : First.entrySet()){
            num.add(entry.getValue());
        }
        List<Integer> nums = new LinkedList<>();
        for(Map.Entry<Character,Integer> entry : Second.entrySet()){
            nums.add(entry.getValue());
        }
        System.out.println(num);
        System.out.println(nums);
        if(num.equals(nums)) same = true;
        return same;
    }
    public static void main(String[] args) {
        String s = "bbbaaaba";
        String t= "aaabbbba";
        System.out.println(isIsomorphic(s,t));
        System.out.println(method2(s, t));
        System.out.println(method3(s, t));
    }
    public static boolean method2(String s, String t){
        Map<Character,Character> x = new HashMap<Character,Character>();
        for(int i=0; i<s.length();i++){
            if(x.containsKey(s.charAt(i))){ 
                if(x.get(s.charAt(i))!=t.charAt(i))return false;
            }
            else{
                if(x.containsKey(t.charAt(i)))return false;
                x.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
    static boolean method3(String s, String t){
        int[] arr1 = new int[128];
        int[] arr2 = new int[128];
        for(int i=0;i<s.length();i++){
            if(arr1[s.charAt(i)]!=arr2[t.charAt(i)])return false;
            arr1[s.charAt(i)] = i+1;
            arr2[t.charAt(i)] = i+1;
        }
        return true;
    }
}