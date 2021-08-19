package Java.Collection_FrameWork.Stack;
import java.util.*;
// GFG
public class GeeksAndBooks{
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the test Sizes");
        int t = in.nextInt();
        while(t-->0){
            System.out.println("Enter number the of queries");
            int q = in.nextInt();
            ArrayList<String> queries = new ArrayList<>();
            System.out.println("Enter the queries");
            for(int i=0;i<=q;i++){
                queries.add(in.nextLine());
            }
            ArrayList<Integer> ans = solving(queries);
            System.out.println(ans);
        }
        in.close();
	}
	static ArrayList<Integer> solving(ArrayList<String> queries){
	    ArrayList<Integer> res = new ArrayList<>();
	    Stack<Integer> stack = new Stack<>();
	    for(int i=1;i<queries.size();i++){
	        String str = queries.get(i);
            char ch = str.charAt(0);
	        if(ch == 'p'){
				String num  = str.substring(6);
	            stack.push(Integer.valueOf(Integer.valueOf(num)));
	        }
	        else if(ch =='r'){
	            if(stack.isEmpty()){
	                res.add(-1);
	            }
	            else{
	                res.add(stack.pop());
	            }
	        }
	    }
	    return res;
	} 
}