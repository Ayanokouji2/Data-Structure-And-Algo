package Java.Collection_FrameWork.Stack;
import java.util.Stack;
//* Pepcoding Question.

public class DuplicateBracket {
    static boolean isDuplicate(String str){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch==')'){
                if(stack.peek()=='(')return true;
                else{
                    while(stack.peek()!='(')stack.pop();
                    stack.pop();
                }
            }
            else{
                stack.push(ch);
            }
        }
        return false;
    }
    // true means the expression is having a duplicate bracket.
    public static void main(String[] args) {
        System.out.println(isDuplicate("((a+b)+(d+e))"));
    }
}
