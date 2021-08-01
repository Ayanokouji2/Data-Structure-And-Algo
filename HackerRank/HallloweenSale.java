package Java.HackerRank;

public class HallloweenSale {
    public static void main(String[] args) {
        System.out.println(howManyGames1(16, 2, 1, 9981));
    }

    public static int howManyGames1(int p, int d, int m, int s) {
        int count =0;
        while(s>0){
            s=s-p;
            if(s<0)break;
            count++;
            if(p!=m)p=p-d;
            if(p<=m){
                p=m;
            }
        }
        return count;
    }
}
