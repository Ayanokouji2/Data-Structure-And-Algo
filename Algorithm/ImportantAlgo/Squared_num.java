package Java.Algorithm.ImportantAlgo;

//* Facebook Interview Question
// ! Arranging Element in Ascending order of their Square.

public class Squared_num {

    public static int[] solution(int[] arr){
        int start =0;
        int end = arr.length-1;
        int[] result = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            if(Math.abs(arr[start])>Math.abs(arr[end])){
                result[i] = (int)Math.pow(arr[start++],2);

            }
            else{
                result[i] = (int)Math.pow(arr[end--],2);
            }
        }
        return result;
    }
    public static void main(String[] args) {

        //? Elements in the array must be in ascending order.

        int[] arr = {-6,-3,-1,2,3,5};
        int sqrd[] = solution(arr);
        for(int tem: sqrd){
            System.out.print(tem+" ");
        }
    }
}
