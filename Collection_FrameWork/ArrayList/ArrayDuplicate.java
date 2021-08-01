package Java.Collection_FrameWork.ArrayList;

import java.util.*;

class ArrayDuplicate {

    public static ArrayList<Integer> duplicates(int arr[], int n) {
  
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int index = Math.abs(arr[i]);
            if(arr[index]<0){ 
                ans.add(index);
            }
            arr[index] = -arr[index];
        }
        if(ans.isEmpty()){
            ans.add(-1);
        }
        Collections.sort(ans);
        // Integer[] res = new Integer[ans.size()];
        // res = ans.toArray(res);
        // Arrays.sort(res);
        // ArrayList<Integer> answer = new ArrayList<Integer>();
        // for(int item:res){
        //     answer.add(item);
        // }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n];
        System.out.println("Enter the Elements");
        for(int i=0;i<n;i++){
            num[i] = in.nextInt();
        }
        System.out.println("Res: "+ duplicates(num,n) );
        in.close(); 
    }
    // ArrayList<Integer> res=new ArrayList<Integer>();
    //     for(int i=0;i<n;i++){
    //         int index = arr[i]%n;
    //         arr[index]+=n;
    //     }
    //     for(int i =0;i<n;i++){
    //         if((arr[i]/n)>=2){
    //             res.add(i);
    //         }                                                // correct solution.
    //     }
    //     if(res.isEmpty()){
    //         res.add(-1);
    //     }
    //    return res;
}
// 17 27 11 23 14 29 17 24 3 6 18 8 18 16 29 11 24 5 0 1 28 3 28 4 13 7 7 27 10 21