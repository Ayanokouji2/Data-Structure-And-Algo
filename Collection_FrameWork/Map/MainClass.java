package Java.Collection_FrameWork.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
// import java.util.List;
// import java.util.ArrayList;

public class MainClass{

    public static int getHash(String s){
        int hash =0;
        for(int i=0; i<s.length();i++){
            hash+=s.charAt(i);
        }
        return hash;
    }

    public static void main(String[] args) {
        Map<String,Integer> num = new HashMap<>();
        num.put("one", 1);
        num.put("two", 2);
        num.put("three", 3);
        num.putIfAbsent("one", 10);
        num.get("five");
        num.replace("one", 2, 10);
        System.out.println(num.get("five"));
        System.out.println( num.containsKey("five"));
        System.out.println(num.keySet());
        System.out.println(num.values());
        System.out.println(num.entrySet());
        Set<Entry<String,Integer>> y = num.entrySet();
        for(Entry<String,Integer> x: y){
            x.setValue(x.getValue() % 2);
        }
        // num.remove("two");
        // List<Integer> ap = new ArrayList<>();
        // ap.add(21);
        // ap.add(22);
        // System.out.println( ap.get(0));
        System.out.println(num);
        System.out.println(getHash("Shivam"));
    }
}