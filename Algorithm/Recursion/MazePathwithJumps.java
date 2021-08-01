package Java.Algorithm.Recursion;

import java.util.ArrayList;
import java.util.List;

public class MazePathwithJumps {
    public static List<String> getPath(int R_des, int C_des,int i_idx,int j_idx){
        if(i_idx == R_des && j_idx == C_des){
            List<String> llist = new ArrayList<String>();
            llist.add("");
            return llist;
        }
        List<String> ans = new ArrayList<String>();
        for(int jt = 1;jt<=C_des-j_idx;jt++){
            List<String> paths = getPath(R_des, C_des,i_idx,j_idx+jt);
            for(String hpath :paths){
                ans.add("h"+jt+hpath);
            }
        }

        for(int jt = 1;jt<=R_des-i_idx;jt++){
            List<String> paths = getPath(R_des, C_des,i_idx+jt,j_idx);
            for(String vpath :paths){
                ans.add("v"+jt+vpath);
            }
        }

        for(int jt = 1; jt <= C_des-j_idx && jt <= R_des-i_idx;jt++){
            List<String> paths = getPath(R_des, C_des,i_idx+jt,j_idx+jt);
            for(String dpath :paths){
                ans.add("d"+jt+dpath);
            }
        }
        System.out.print(ans.size()+" ");
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(getPath(3, 2,1,1));
    }
}
