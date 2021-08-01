package Java.Algorithm.Recursion;

import java.util.ArrayList;
import java.util.List;

public class MazePath {
    public static List<String> getpath(int N,int M , int start, int end){
        if(start==N-1 && end==M-1){
            List<String> llist = new ArrayList<String>();
            llist.add("");
            return llist; 
        }
        if(start>N || end>M){
            List<String> llist = new ArrayList<String>();
            llist.add("Not Possible");
            return llist;
        }


        List<String> vertical = new ArrayList<String>();
        if(start<N-1){
            vertical = getpath(N,M,start+1,end);
        }
        List<String> horizontal = new ArrayList<String>();
        if(end<M-1){
             horizontal = getpath(N,M,start,end+1);
        }

        List<String> res = new ArrayList<String>();
        for(String ways:vertical){
            res.add('v'+ways);
        }
        for(String ways:horizontal){
            res.add('h'+ways);
        }
        return res; 
    }
    public static void main(String[] args) {
        System.out.println(getpath(3,4,0,0));
    }
}
