package Java.Collection_FrameWork.Stack;
import java.util.*;
// GfG
public class PostFixEvaluation {
    public static int evaluatePostFix(String S)
    {
        Stack<Integer> operators = new Stack<>();
        for(int i=0;i<S.length();i++){
            char ch = S.charAt(i);
            if(!Character.isDigit(ch)){
                int v2 = operators.pop();
                int v1 = operators.pop();
                int num = operations(ch,v2,v1);
                operators.push(num);
                continue;
            }
            operators.push(Integer.valueOf(ch-'0'));
        }
        return operators.pop();
    }
    private static int operations(char ch ,int v2,int v1){
        if(ch=='+')return v1+v2;
        else if(ch=='-')return v1-v2;
        else if(ch=='*')return v1*v2;
        else if(ch=='/')return v1/v2;
        return 0;
    }
    public static void main(String[] args) {
        String str = "231*+9-";
        System.out.println(evaluatePostFix(str));
    }
}
