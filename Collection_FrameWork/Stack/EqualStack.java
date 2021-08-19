package Java.Collection_FrameWork.Stack;
//* HackerRank
import java.util.*;

public class EqualStack{
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=h1.size()-1;i>=0;i--){
            if(stack.isEmpty()){
                stack.add(h1.get(i));
            }
            else {
                stack.add(h1.get(i)+stack.peek());
            }
        }

        Stack<Integer> stack2 = new Stack<Integer>();
        for(int i=h2.size()-1;i>=0;i--){
            if(stack2.isEmpty()){
                stack2.add(h2.get(i));
            }
            else {
                stack2.add(h2.get(i)+stack2.peek());
            }
        }

        Stack<Integer> stack3 = new Stack<Integer>();
        for(int i=h3.size()-1;i>=0;i--){
            if(stack3.isEmpty()){
                stack3.add(h3.get(i));
            }
            else {
                stack3.add(h3.get(i)+stack3.peek());
            }
        }
        int height = 0;

        while(true){
            if(stack.peek()==stack2.peek() && stack.peek()==stack3.peek()){
                height = stack.peek();
                break;
            }
            if(stack.peek()>=stack2.peek()) {
                if(stack.peek()>stack3.peek() )stack.pop();
                else {
                    if(stack3.peek()>stack2.peek() )stack3.pop();
                }
            }
            else stack2.pop();

            if(stack.isEmpty() || stack2.isEmpty() || stack3.isEmpty()) break;
        }
        // System.out.println(stack);
        // System.out.println(stack2);
        // System.out.println(stack3);

        return height;
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        List<Integer> h1 = new ArrayList<Integer>();
        List<Integer> h2 = new ArrayList<Integer>();
        List<Integer> h3 = new ArrayList<Integer>();

        System.out.println("Enter size1");
        int n1 = in.nextInt(); 
        System.out.println("Enter size2");
        int n2 = in.nextInt();        
        System.out.println("Enter size3");
        int n3 = in.nextInt(); 

        System.out.println("Enter Elements1");
        for(int i = 0; i < n1; i++){
            h1.add(in.nextInt());
        }

        System.out.println("Enter Elements2");
        for(int i = 0; i < n2; i++){
            h2.add(in.nextInt());
        }

        System.out.println("Enter Elements3");
        for(int i = 0; i < n3; i++){
            h3.add(in.nextInt());
        }

        System.out.println(equalStacks(h1,h2,h3));
        // System.out.println(h1);
        // System.out.println(h2);
        // System.out.println(h3);
        in.close();
    }
    public static int equalStacks2(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        // Write your code here
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> st3 = new Stack<>();
        int maxHeight = 0;
        for(int i=h1.size()-1; i>=0; i--){
          if(st1.isEmpty()){
            int a = h1.get(i);
            st1.push(a);
          }else{
            int a = h1.get(i)+st1.peek();
            st1.push(a);
          }
            
        }
        for(int i=h2.size()-1; i>=0; i--){
          if(st2.isEmpty()){
            int b = h2.get(i);
            st2.push(b);
          }else{
            int b = h2.get(i)+st2.peek();
            st2.push(b);
          }
        }
        for(int i=h3.size()-1; i>=0; i--){
          if(st3.isEmpty()){
            int c = h3.get(i);
            st3.push(c);
          }else{
            int c = h3.get(i)+st3.peek();
            st3.push(c);
          }
        }
        // return st1.pop();
        while(!st1.isEmpty()&&!st2.isEmpty()&&!st3.isEmpty()){
          int stack1Height = st1.peek();
          int stack2Height = st2.peek();
          int stack3Height = st3.peek();
          
          if(stack1Height==stack2Height && stack2Height==stack3Height){
            return st1.peek();
          }
          if(stack1Height>stack2Height||stack1Height>stack3Height){
            st1.pop();
          }else if(stack2Height>stack1Height||stack2Height>stack3Height){
            st2.pop();
          }else if(stack3Height>stack1Height||stack1Height>stack2Height){
            st3.pop();
          }
        }
        return maxHeight;
    
        }
    
}