package Java.Collection_FrameWork.LinkedList;

import java.util.*;
public class CompareList {

    public static  boolean comparison(List<Integer> l1, List<Integer> l2){
        // boolean result = false;
        if(l1.size()!=l2.size()){
            return false;
        }
        else{
            if(l1.containsAll(l2)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<Integer> y = new LinkedList<Integer>();
        Scanner in = new Scanner(System.in);
        System.out.println("Size");
        int size = in.nextInt();
        System.out.println("Elements");
        for(int i = 0; i < size; i++){
            y.add(in.nextInt());
        }
        List<Integer> x = new LinkedList<Integer>();
        System.out.println("Size");
        int size1 = in.nextInt();
        System.out.println("Elements");
        for(int i = 0; i < size1; i++){
            x.add(in.nextInt());
        }
        boolean ans = comparison(y, x);
        System.out.println(ans);
        in.close();
    }
}
