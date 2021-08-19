package Java.Collection_FrameWork.Stack;
import java.io.*;
import java.util.*;
// *PepCoding.
public class MinStack2 {

  public static class MinStack {
    Stack<Integer> data;
    int min;

    public MinStack() {
      data = new Stack<>();
    }

    int size() {
        return data.size();
    }

    void push(int val) {
        if(data.isEmpty()){
            data.push(val);
            min = val;
        }
        else if(val>=min){
            data.push(val);
        }
        else{
            data.push(val+val-min);
            min = val;
        }
    }

    int pop() {
        if(data.peek()<min){
            int val = min;
            min = min+min-data.pop();
            return val;
        }
        else return data.pop();
    }

    int top() {
        if(data.peek()<min)return min;
        else return data.peek();
    }

    int min() {
        if(data.isEmpty()){
            System.out.println("Stack underflow");
            return -1;
        }
        else{
            return min;
        }
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    MinStack st = new MinStack();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("push")) {
        int val = Integer.valueOf(str.substring(5));
        // int val = Integer.parseInt(str.split(" ")[1]);
        st.push(val);
      } else if (str.startsWith("pop")) {
        int val = st.pop();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("top")) {
        int val = st.top();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(st.size());
      } else if (str.startsWith("min")) {
        int val = st.min();
        if (val != -1) {
          System.out.println(val);
        }
      }
      str = br.readLine();
    }
  }
}
/*push 10
push 20
push 5
push 8
push 2
push 4
push 11
top
min
pop
top
min
pop
top
min
pop
top
min
pop
top
min
pop
top
min
pop
top
min
pop
quit */