package Java.Algorithm.ImportantAlgo;

//? Moore's Voting Algorithm.
//! time complexity --> O(N) and space --> O(1). 
//* Using Map its time complexity is O(N) and space --> O(N).

public class MajorityElement {
    static int majority(int[] arr, int n ){
        int ansidx =0;
        int count=1;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[ansidx])count++;
            else count--;
            if(count==0){ansidx=i;count=1;}
        }
        if(count<n/2){
            count =0;
            for(int i=0;i<n;i++){
                if(arr[i]==arr[ansidx])count++;
            }
            if(count>n/2)return arr[ansidx];
        }
        else if(count>n/2)return arr[ansidx];
        return -1; //? return -1 when the frequency of the majority elemnts becomes equal to arr.length/2.
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        System.out.println("Answer -->:" + majority(arr,arr.length));
    }
}
