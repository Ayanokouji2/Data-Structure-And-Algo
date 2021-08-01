package Java.Algorithm.Recursion;



public class AllIndices{

    public static int[] collectIndices(int[] arr,int k,int index,int fsf){
        
        if(index == arr.length){
            
            return new int[fsf];
        }
        
        if(arr[index]==k){
            int irr[] =collectIndices(arr,k,index+1,fsf+1);
            irr[fsf]=index;
            return irr;
        }
        else{
            int irr[] =collectIndices(arr,k,index+1,fsf);
            return irr;
        }
      
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,1,3,7,3,3};
        int[] ans = (collectIndices(arr,3,0,0));
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}