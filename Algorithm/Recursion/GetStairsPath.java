package Java.Algorithm.Recursion;

import java.util.ArrayList;
import java.util.List;

public class GetStairsPath {
    public static List<String> getStairs(int n){
        if(n==0){
            List<String> list = new ArrayList<String>();
            list.add("");
            return list;
        }
        if(n<0){
            return new ArrayList<String>();
        }
        List<String> path1 = getStairs(n-1);
        List<String> path2 = getStairs(n-2);
        List<String> path3 = getStairs(n-3);

        List<String> result = new ArrayList<String>();
        for(String path:path1){
            result.add(1+path);
        }
        for(String path:path2){
            result.add(2+path);
        }
        for(String path:path3){
            result.add(3+path);
        } 
        return result;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(getStairs(n));
    }
}
