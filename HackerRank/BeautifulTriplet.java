package Java.HackerRank;

import java.util.*;

public class BeautifulTriplet {
    public static int beautifulTriplets(int d, List<Integer> arr) {
        // Write your code here
        int count =0;
        for(int i=0; i<arr.size();i++){
            for(int j=i+1; j<arr.size();j++){
                if(arr.get(j)-arr.get(i)==d){
                    for(int k=j+1; k<arr.size();k++){
                        if(arr.get(k)-arr.get(j)==d)count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> arr = Arrays.asList(2,2,3,4,5);
        System.out.println(beautifulTriplets(1,arr));
        in.close();
    }
        
}
