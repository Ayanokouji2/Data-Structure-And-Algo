package Java.HackerRank;


public class LuckyNumber {
    public static long luckyNumbers(long a, long b) {
        // Write your code here
            
            int count=0;
            
            for(long i=a;i<=b;i++){
                long temp =i;
                long sum=0;
                long sqsum=0;
                while(temp>0){
                    long digit=temp%10;
                    sum+=digit;
                    sqsum+=Math.pow(digit,2);
                    temp/=10;
                }
                if(prime(sum) && prime(sqsum))count++;
            }
            return count; 
        }
        static boolean prime(long x){
            boolean checked=false;
            if(x==1)return false;
            for(long i=2;i<=(long)Math.sqrt(x);i++){
                if(x%i==0){
                    checked=true;
                    break;
                }
            }
            if(checked)return false;
            return true;
        }
        public static void main(String[] args) {
            System.out.println(luckyNumbers(1,20));
        }
}
