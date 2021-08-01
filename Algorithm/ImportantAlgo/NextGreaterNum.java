package Java.Algorithm.ImportantAlgo;



public class NextGreaterNum{
    public static int nextGreaterElement(int n) {
        String num = String.valueOf(n);
        char[] nums = num.toCharArray();
        int start = num.length()-2;
        int after = start+1;
        while(start>=0 && nums[start]>=nums[start+1])start--;
        if(start==-1)return -1;
        while(nums[start]>=nums[after])after--;
    
        int temp = nums[start];
        nums[start] = nums[after];
        nums[after] = (char)temp;

        num = String.valueOf(nums);
       

        String str = num.substring(0,start+1);
        StringBuilder lufy = new StringBuilder();
       
        for(int i=nums.length-1;i>=start+1;i--){
            lufy.append(nums[i]);
        }
        
        str+=lufy.toString();

        return Long.valueOf(str)>2147483647?Integer.valueOf(str):-1;
    }
    public static void main(String[] args) {
        System.out.println(nextGreaterElement(2147483641));
    }
}