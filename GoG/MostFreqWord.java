package Java.GoG;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MostFreqWord {
    public static String mostFrequentWord(String arr[],int n)
    {
        //? First store the Elements in the Map. For Key Value Pair
        Map<String,Integer> x = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!x.containsKey(arr[i]))x.put(arr[i],1);
            else x.put(arr[i],x.get(arr[i])+1);
        }
        
        //* Second Count The Maxmium Freq in the array.
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(x.get(arr[i])>max)max = x.get(arr[i]);
        }
        
        //! Atlast store the maxmimum String that have max freq.
        int i=0;
        ArrayList<String> array = new ArrayList<>();
        for( i=0;i<n;i++){
            if(x.get(arr[i])==max && !array.contains(arr[i]))array.add(arr[i]);
        }
        if(!array.isEmpty()) return array.get(array.size()-1);
        return arr[i-1];
           
    }
    public static void main(String[] args) {
        String arr[] = {"xejdcj", "xejdcj", "lvjpb", "tmyuiu", "lvjpb", "tmyuiu", "ovoba", "lvjpb", "lvjpb", "fqhyu", "fqhyu", "tmyuiu","xejdcj","tmyuiu", "fqhyu", "ovoba","xejdcj"};
        System.out.println(mostFrequentWord(arr,arr.length));
    }
}
