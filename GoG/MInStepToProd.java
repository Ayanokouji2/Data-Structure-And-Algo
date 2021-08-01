package Java.GoG;

import java.util.Scanner;
//! Correct for some testscases.
public class MInStepToProd {
    static int makeProductOne(int[] arr, int N) {
        int neg =0;
        int count =0;
        for(int i=0;i<N;i++){
            int val = 0;
            if(arr[i]==-1)neg++;
            
            if(arr[i]<-1){
                neg++;
                count += Math.abs(arr[i]+1);
                val = Math.abs(arr[i]+1);
                arr[i] = arr[i]+val;
            }
            else if(arr[i]>1){
                count += Math.abs(arr[i]-1);
                val = Math.abs(arr[i]-1);
                arr[i] = arr[i] - val;
            }
            else if(arr[i]==0){
                count +=1;
                arr[i] = arr[i]+1;
            }
            
        }
        
        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
        int prod =1;
        for(int val:arr){
            prod*=val;
        }

        System.out.println("Product of Array -->: "+prod);
        System.out.println(count);
        if(neg%2!=0 || prod<0)count+=2;
        System.out.println();
        System.out.print("Answer -->: ");
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println(makeProductOne(arr,arr.length));
        in.close();
    }
}
