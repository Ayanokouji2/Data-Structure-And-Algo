package Java.Practise;

import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size");
        int n = in.nextInt();
        System.out.println("Elements");
        char[] arr = new char[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.next().charAt(0);
        }

        for(int i=0; i < n; i++) {
            for(int j=i; j < n ; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
        in.close();
    }
}
