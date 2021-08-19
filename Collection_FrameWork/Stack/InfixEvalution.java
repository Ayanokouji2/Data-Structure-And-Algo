package Java.Collection_FrameWork.Stack;

// *Pepcoding/GeeksforGeeks
import java.util.*;
public class InfixEvalution {
    private static int infixEvalution(String str) {
        int ans =0;
        Stack<Integer> operators = new Stack<Integer>();
        Stack<Character> operands = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch))operators.add(Integer.valueOf(ch-'0')); 
        
            else if(ch==')'){
                while(operands.peek()!='('){
                    int v2 = operators.pop(); 
                    int v1 = operators.pop();
                    char oper = operands.pop();
                    int num = operations(v2,v1,oper);
                    operators.push(num);
                }
                operands.pop();
            }
            else if(ch=='(')operands.push(ch);
            else if(ch=='+' || ch=='-' || ch=='*'|| ch=='/'){
                while(!operands.isEmpty() && preference(ch)<=preference(operands.peek()) && operands.peek()!='(' ){
                    int v2 = operators.pop(); 
                    int v1 = operators.pop();
                    char oper = operands.pop();
                    int num = operations(v2,v1,oper);
                    operators.push(num);
                }
                operands.push(ch);
            }
        }
        while(!operands.isEmpty()){
            int v2 = operators.pop(); 
            int v1 = operators.pop();
            char oper = operands.pop();
            int num = operations(v2,v1,oper);
            operators.push(num);
        }
        ans = operators.pop();
        return ans;
    }
    private static int operations(int v2, int v1, char oper) {
        if(oper =='+')return v1 + v2;
        else if(oper =='-') return v1-v2;
        else if(oper == '*') return v1*v2;
        else{
            return v1 / v2;
        }
    }
    private static int preference(char ch){
        if(ch=='+'|| ch=='-')return 1;
        else if(ch=='*'||ch=='/')return 2;
        else return 3;
    }
    public static void main(String[] args) {
        String str = "2+8/4-(5*6)+(2+5)";
        System.out.println(infixEvalution(str));
    }
    
}
