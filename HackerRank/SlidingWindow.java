package Java.HackerRank;

import java.util.*;

public class SlidingWindow{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Array size");
        int size = in.nextInt();
        System.out.println("Enter the Window size");
        int k = in.nextInt();
        int min =0;
        System.out.println("Entre the Elements");
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = in.nextInt();            
        }
        int max =0;
        int n =(size+2)-k;
        System.out.print("Maximum Elemnet inside the Window: ");
        for(int i = 0; i <=n;i++){
            max =arr[min];
            if(k>size){
                break;
            }
            for(int j =min;j<k;j++){
                if(max<arr[j]){
                    max = arr[j];
                }
            }
            min++;
            k++;
            System.out.print(max + " ");
        }
        in.close();
    }
}