package Java.HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class BalancedBracket{
    public static String is(String s) {
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        if(s.charAt(0)=='}' || s.charAt(0)==']'|| s.charAt(0)==')')return "NO";
        ArrayList<Character> bracket = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='{' || ch=='[' || ch=='('){
                bracket.add(ch);
            }
            else{
                char sh='A' ;
                    if(!bracket.isEmpty()){
                        sh = bracket.remove(bracket.size()-1);
                    }else return "NO";
                // System.out.println(s.charAt(i));
                if(sh!=map.get(s.charAt(i)))return "NO";
            }
        }
        // System.out.println(bracket.size());
        return bracket.size()==0?"Yes":"No";
    }

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for(int i=0;i<1;i++){
            System.out.println(is(in.nextLine()));
        }
        in.close();
    }
}
/* }][}}(}][))]
[](){()}
()
({}([][]))[]()
{)[](}]}]}))}(())(
([[)*/
/* YES
NO
NO
NO
NO
NO
NO
NO
NO
YES
YES
YES
NO
YES
NO
YES
NO
YES
NO
NO
NO*/