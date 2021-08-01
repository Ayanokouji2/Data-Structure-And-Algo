package Java.HackerRank;

import java.util.*;
import java.util.Map.Entry;

public class SherlockValidString{
    public static String isValid(String s) {
        
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i)))map.put(s.charAt(i),1);
            else map.put(s.charAt(i),map.get(s.charAt(i))+1);
        }

        Set<Integer> set = new HashSet<>(map.values());
        if(set.size()==1)return "YES";
        else if(set.size()>=3) return "NO";
         
        Map<Integer,Integer> x = new HashMap<Integer,Integer>();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            if(!x.containsKey(map.get(s.charAt(i))))x.put(map.get(s.charAt(i)),1);
            else x.put(map.get(s.charAt(i)),x.get(map.get(s.charAt(i)))+1);
            max = Math.max(max,x.get(map.get(s.charAt(i))));
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>(map.values());
        int a =0;
        for(int val : list){
            if(x.get(val) == max){
                a=val;
                break;
            }
        }

        Set<Entry<Character,Integer>> luffy = map.entrySet();
        for(Entry<Character,Integer> entry:luffy){
            if(entry.getValue()!=a){
                entry.setValue(entry.getValue()-1);
                if(entry.getValue()==0)map.remove(entry.getKey());
                break;
            }
        }
        
        Set<Integer> nami = new HashSet<Integer>(map.values());
        if(nami.size()==1)return "YES"; 
        return "NO";
        }

        public static void main(String[] args) {
            System.out.println(isValid("abcdefghhgfedecba"));
        }
}
// ? abcdefghhgfedecba YES
// * aabbccddeefghi NO
// ! xxxaabbccrry