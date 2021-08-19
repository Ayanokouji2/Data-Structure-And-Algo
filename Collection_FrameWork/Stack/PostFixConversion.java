package Java.Collection_FrameWork.Stack;
// pepcoding.
// todo Converting Postfix Expression --> Infix/Prefix.
import java.util.*;
public class PostFixConversion {
    private static String evluation(String exp){
        Stack<String> Infix = new Stack<String>();
        Stack<String> Prefix = new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(Character.isLetter(ch)){
                Infix.push(String.valueOf(ch));
                Prefix.push(Character.toString(ch));
            }
            else{
                String v2 = Infix.pop();
                String v1 = Infix.pop();
                String str = operations(v2,v1,ch);
                Infix.push(str);
                v2 = Prefix.pop();
                v1 = Prefix.pop();
                str = operations1(v2,v1,ch);
                Prefix.push(str);
            }
        }
        System.out.println("Prefix--> "+Prefix.pop());
        return Infix.pop();
    }
    private static String operations1(String v2, String v1, char ch) {
        return ch+v1+v2;
    }
    private static String operations(String v2, String v1, char ch) {
        return v1+ch+v2;
    }
    public static void main(String[] args) {
        String str = "ab+cde*^-zv/+";
        System.out.println("Infix--> "+evluation(str));
    }
}
