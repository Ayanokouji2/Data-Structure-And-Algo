package Java.Practise;

import java.util.Scanner;

public class Barchart{
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner in = new Scanner(System.in);
        
    
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max)max = arr[i];
        }
        printing(arr,max);
        in.close();
     }
     
        public static void printing(int[] arr,int k){
            for(int i=k;i>0;i--){
                for(int j=0;j<arr.length;j++){
                    if(arr[j]>=i)System.out.print("*  ");
                    else System.out.print("   ");
                }
                System.out.println();
            }
        }
}