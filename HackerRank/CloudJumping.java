package Java.HackerRank;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;



public class CloudJumping{
    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
            int count=0;
            for(int i=0;i<c.size()-1;i+=2){
                count++;
                if(c.get(i+1)==1)i--;
                if(i==c.size()-2)i--;
            }
            return count;
        }
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            List<Integer> cloud = new LinkedList<Integer>();
            for(int i=0;i<=100;i++){
                cloud.add(in.nextInt());
            }
            System.out.println(jumpingOnClouds(cloud));
            in.close();
        }
}