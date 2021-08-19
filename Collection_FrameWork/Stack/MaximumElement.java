package Java.Collection_FrameWork.Stack;
//* HackerRank Question.

import java.util.*;

public class MaximumElement {
    private static List<Integer> givingMax(List<String> operations) {
        Stack<Integer> stack = new Stack<Integer>();
        List<Integer> asn = new ArrayList<Integer>();
        for(int i=0;i<operations.size();i++){
            String str = operations.get(i);
            // System.out.println(str);
            if(str.charAt(0)=='1'){
                int numn = Integer.valueOf(str.substring(2));
                if(stack.isEmpty())stack.push(numn);
                else {
                    if(stack.peek()<numn)stack.push(numn);
                    else stack.push(stack.peek());
                }
            }
            else if(str.charAt(0)=='2')stack.pop();
            else{
                int n = Integer.valueOf(stack.peek());
                asn.add(n);
            }
                
        }
        // System.out.println(stack);
        return asn;
    } 

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> operations = new ArrayList<>();
        // operations.add("1 97");
        // operations.add("2");
        // operations.add("1 20");
        // operations.add("2");
        // operations.add("1 26");
        // operations.add("1 20");
        // operations.add("2");
        // operations.add("3");
        // operations.add("1 91");
        // operations.add("3");
        for(int i=0;i<68;i++){
            operations.add(in.nextLine());
        }
        System.out.println(givingMax(operations));
        in.close();
    }

}
/*
44
44
1
1
3
29
73
73
73
73
73
73
73
73
73
85
85
85
86
86
100
100
100*/