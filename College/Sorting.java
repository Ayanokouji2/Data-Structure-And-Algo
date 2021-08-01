package Java.College;

import java.util.*;

public class Sorting{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = in.nextInt();
        System.out.println("Enter the Elements in Array");
        int[] arr = new int[size];
        for (int i = 0; i <size;i++){
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Sorted Array(Asscending): ");
        for(int item: arr){
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.print("Sorted Array(Descending): ");
        for(int i=size-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
        in.close();
    }
}