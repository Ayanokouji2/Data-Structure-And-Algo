package Java.GoG;

import java.util.LinkedHashMap;
import java.util.Map;

 class Geeks
{
    
    public static int LargButMinFreq(int arr[], int n)
    {
        // Your code here
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])) map.put(arr[i],1);
            else map.put(arr[i],map.get(arr[i])+1);
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<map.get(arr[i])) max = map.get(arr[i]);
        }
        System.out.println(map.keySet());
        return max;
    }
}
public class FrequencyGame  {
    public static void main(String[] args) {
        int[] array = {2 ,2 ,5 ,50 ,1};
        // Geeks obj = new Geeks();
        int nu = Geeks.LargButMinFreq(array,array.length);
        System.out.println(nu);
    }
}
