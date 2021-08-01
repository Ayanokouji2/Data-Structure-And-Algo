package Java.Practise;

public class AllSubset {
    static String solution(int[] arr){
       
        int limit = (int)Math.pow(2, arr.length);
        for(int i=0; i<limit; i++){
            String set=" " ;
            int temp=i;
            for(int j=arr.length-1; j>=0; j--){
                int r =temp%2;
                temp = temp/2;

                if(r==0)set = "_\t" + set;
                else set =arr[j]+"\t" + set;
            }
            System.out.println(set);
            
            // System.out.println();
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        System.out.println(solution(arr));
    }
}
