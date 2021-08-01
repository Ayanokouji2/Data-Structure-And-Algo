package Java.HackerRank;
import java.util.*;


public class GroupAnagram { 
    public  static List<List<String>> groupAnagram(String[] str){
        Map<String,List<String>> map = new TreeMap<>();
        for(String s: str){
            char charArray[] = s.toCharArray();
            Arrays.sort(charArray); 
            String sorted = new String(charArray);
            if(!map.containsKey(sorted)){
                map.put(sorted,new LinkedList<String>() );
            }
            map.get(sorted).add(s);
        }
        
        return new LinkedList<>(map.values());
    }
    public static void main(String[] args) {
        
        String str[] = {"eat","tea","tan","ate","nat","bat" };
        System.out.println(groupAnagram(str));
    }  
}
