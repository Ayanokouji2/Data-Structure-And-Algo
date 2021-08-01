package Java.HackerRank;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EqualizeTheArray {
    public static int equalizeArray(List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.size(); i++){
            if(!map.containsKey(arr.get(i)))map.put(arr.get(i),1);
            else map.put(arr.get(i),map.get(arr.get(i))+1);
        }

        ArrayList<Integer> freq = new ArrayList<>(map.values());
        int max = Integer.MIN_VALUE;
        int sum =0;
        for(int i = 0; i < freq.size(); i++){                   
            sum+=freq.get(i);
            if(freq.get(i)>max)max = freq.get(i);
        }
        return sum-max;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> arr = new ArrayList<Integer>();
        int size = 88;
        System.out.println("Elements");
        for(int i = 0; i < size; i++) {
            arr.add(in.nextInt());
        }
        System.out.println(equalizeArray(arr));
        in.close();
    }
}
