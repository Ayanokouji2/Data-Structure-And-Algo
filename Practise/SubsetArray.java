package Java.Practise;

import java.util.Scanner;

public class SubsetArray {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int size = in.nextInt();
        System.out.println("Elements");
        int [] arr = new  int [size];
        for(int val =0;val<size;val++){
            arr[val] = in.nextInt();
        }
        int limit = (int)Math.pow(2,size);
        for(int i=0;i<limit;i++){
            String sb = "";
            int temp = i;

            for(int j =arr.length-1;j>=0;j--){
                int r = temp%2;
                temp/=2;
                if(r==0){
                    sb = "-\s"+ sb;
                }
                else{
                   sb = arr[j]+"\s" + sb;
                }
            }
            System.out.println(sb);
        }

        in.close();
    }
}
