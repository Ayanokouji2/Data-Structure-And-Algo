package Java.Practise;

public class StockBuySell {
//! For only 1 transcation only.

    static int getProfit(int []stocks){
        int getmin = stocks[0];
        int maxprofit = 0;
        for(int i=0;i<stocks.length;i++){
            int profit = stocks[i] - getmin;
            getmin = Math.min(getmin,stocks[i]);
            maxprofit = Math.max(profit,maxprofit);
        }
        System.out.print("Maximum Profit -->: ");
        return maxprofit;
    }
    
    //? for unlimited transcations.
    
    static int getProfit2(int[] stocks){
        int profit =0;
        for(int i=1;i<stocks.length;i++){
            if(stocks[i]>stocks[i-1]){
                profit += stocks[i] - stocks[i-1];
            }
        }
        System.out.print("Maximum Profit -->: ");
        return profit;
    } 
    public static void main(String[] args) {
        int[] stocks = {1,4,11,1,8,9};
        System.out.println(getProfit(stocks));
        System.out.println(getProfit2(stocks));
    }
}
