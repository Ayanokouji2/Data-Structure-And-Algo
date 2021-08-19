package Java.Collection_FrameWork.Stack;

import java.util.*;
// Pepcoding.
//todo Converting Infix Expression --> Postfix/Prefix.
public class InFixConversion{
    private static String Conversion(String exp){
        Stack<String> Prefix = new Stack<String>();
        Stack<String> Postfix = new Stack<String>();
        Stack<Character> operands = new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(ch =='(')operands.add(ch);
            else if(Character.isLetter(ch)){
                Prefix.push(Character.toString(ch));
                Postfix.push(Character.toString(ch));
            }
            else if(ch=='+' || ch=='-' || ch=='*'||ch=='/'||ch=='^'){
                while(!operands.isEmpty() && precedence(operands.peek())>=precedence(ch) && operands.peek()!='('){
                    char oper = operands.pop();
                    String v2 = Prefix.pop();
                    String v1 = Prefix.pop(); 
                    String  str = operations(oper,v2,v1);
                    Prefix.push(str);
                    v2 = Postfix.pop();
                    v1 = Postfix.pop();
                    str = opertions2(v2,v1,oper);
                    Postfix.push(str);
                }
                operands.push(ch);
            }   
            else if(ch==')'){
                while(operands.peek()!='('){
                    char oper = operands.pop();
                    String v2 = Prefix.pop();
                    String v1 = Prefix.pop(); 
                    String  str = operations(oper,v2,v1);
                    Prefix.push(str);
                    v2 = Postfix.pop();
                    v1 = Postfix.pop();
                    str = opertions2(v2,v1,oper);
                    Postfix.push(str);
                }
                operands.pop();
            }
        }
        while(!operands.isEmpty()){
            char oper = operands.pop();
            String v2 = Prefix.pop();
            String v1 = Prefix.pop(); 
            String  str = operations(oper,v2,v1);
            Prefix.push(str);
            v2 = Postfix.pop();
            v1 = Postfix.pop();
            str = opertions2(v2,v1,oper);
            Postfix.push(str);
        }
        System.out.println("Prefix --> "+Prefix.pop());        
        return Postfix.pop();
    }

    private static String opertions2(String v2, String v1, char oper) {
        String str = v1+v2+Character.toString(oper);
        return str;
    }

    private static String operations(char A,String v2,String v1){
        String str =Character.toString(A)+v1+v2;
        return str;
    }

    private static int precedence(char A){
        if(A=='+')return 1;
        else if(A=='-') return 1;
        else if(A=='*')return 2;
        else if(A=='/')return 2;
        else return 3;
    }

    public static void main(String[] args) {
        String exp = "a+b-c^(d*e)+z/v";
        System.out.println("Postfix--> "+Conversion(exp));
    }
}