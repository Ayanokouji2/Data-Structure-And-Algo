package Java.Collection_FrameWork.Stack;

//*Pepcoding/Gfg
import java.util.*;
public class SamllestNumPattern {
    private static String Nami(String str) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            count++;
            if (c == 'd') {
                st.push(count);
            } else {
                st.push(count);
                while (!st.isEmpty()) {
                    sb.append(st.pop());
                }
            }
        }
        st.push(++count);
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "ddiiddi";
        // 3214765
        System.out.println("Answer-->" + Nami(str));
    }
}
