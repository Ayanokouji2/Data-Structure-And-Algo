package Java.HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DiagonalDiff {
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
            int lr = 0;
            int rl = 0;
            int n = arr.get(0).size();
            for(int i=0;i<arr.size();i++){
                for(int j=0;j<arr.get(0).size();j++){
                    if(i==j){
                       lr += arr.get(i).get(j); 
                    }
                    if(i+j == n-1){
                        rl += arr.get(i).get(j);
                    }  
                }
            }
            System.out.println(lr+" "+rl);
            int sum = Math.abs(lr - rl);
            return sum;
        }

        public static void main(String[] args) {
            List<List<Integer>> MainList = new ArrayList<List<Integer>>();
            Random NewRandomNumber = new Random();
            
            for (int i = 0; i < 3; i++) {
                List<Integer> SecondList = new ArrayList<Integer>();
                MainList.add(SecondList);
                for (int i2 = 0; i2 < 3; i2++) {
                    SecondList.add(NewRandomNumber.nextInt(6));
                }
            }
            System.out.println(MainList);
            System.out.println(MainList.get(0).size());
            System.out.println(MainList.size());
            System.out.println(diagonalDifference(MainList));
        }
}
