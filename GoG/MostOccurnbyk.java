package Java.GoG;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostOccurnbyk {
    public static int countOccurence(int[] arr, int n, int k) 
    {
        Map<Integer,Integer> x = new HashMap<>();
        for(int i=0;i<n;i++){
           if(!x.containsKey(arr[i]))x.put(arr[i],1);
           else x.put(arr[i],x.get(arr[i])+1);
        }
        int limit = n/k;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            if(x.get(arr[i])>limit)set.add(arr[i]);
        }
       
       return set.size();
    }
    public static void main(String[] args) {
        int arr[] = {3,1,2,2,1,2,3,3};
        System.out.println("Answer -->: " + countOccurence(arr,arr.length,4));
    }
}
