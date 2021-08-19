package Java.Collection_FrameWork.Queue;

import java.util.*;

public class QueueAdaptionStack {
    public static class QueueToStackAdapter {
        Queue<Integer> mainQ;
        Queue<Integer> helperQ;

        public QueueToStackAdapter() {
            mainQ = new ArrayDeque<>();
            helperQ = new ArrayDeque<>();
        }

        int size() {
            return mainQ.size();

        }

        void push(int val) {
            if (mainQ.isEmpty()) {
                mainQ.add(val);
            } else {
                while (!mainQ.isEmpty()) {
                    helperQ.add(mainQ.remove());
                }
                mainQ.add(val);
                while (!helperQ.isEmpty()) {
                    mainQ.add(helperQ.remove());
                }
            }
        }

        int pop() {
            if (mainQ.size() == 0) {
                System.out.println("Stack underflow");
                return -1;
            } else {
                return mainQ.remove();
            }
        }

        int top() {
            if (mainQ.size() == 0) {
                System.out.println("Stack underflow");
                return -1;
            } else {
                return mainQ.peek();
            }

        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        QueueToStackAdapter stack = new QueueToStackAdapter();
        ArrayList<String> queue = new ArrayList<>();
        queue.add("commands-->");
        System.out.println("Commands");
        while (queue.get(queue.size() - 1).equals("quit") == false) {
            queue.add(in.nextLine());
        }
        // System.out.println(queue);
        for (int i = 1; i < queue.size()-1; i++) {
            String str = queue.get(i);
            str.trim();
            if (str.equals("pop")) {
                int val = stack.pop();
                if(val!=-1)
                    System.out.println("Just Popped--> "+val);
            } else if (str.equals("top")) {
                int val = stack.top();
                if(val!=-1)
                    System.out.println("At the Top--> "+val);
            } else if (str.equals("size")) {
                System.out.println("Size of--> "+stack.size());
            } else {
                stack.push(Integer.valueOf(str.substring(5)));
            }
        }
        in.close();
    }
}
/*push 10
push 20
push 5
push 8
push 2
push 4
push 11
size
top
pop
top
pop
top
pop
top
pop
top
size
pop
top
pop
pop */