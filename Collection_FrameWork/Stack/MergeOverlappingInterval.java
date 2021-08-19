package Java.Collection_FrameWork.Stack;
//* Pepcoding.
import java.util.*;

public class MergeOverlappingInterval{

    private static ArrayList<intervals> overlapping(intervals[] inter){

        // todo Sorting the intervals using lambda function on the basis of the starting value. And using comparator
        // Arrays.sort(inter,new Comparator<intervals>(){
        //     @Override
        //     public int compare(intervals start1, intervals start2){
        //         return start1.start-start2.start;
        //     }
        // });

        //! We are only able to sort like this because of the comparable interface as the Normal Sorting method only sorts interger data type and using the comparable interface we can sort the objects also.
        Arrays.sort(inter);

        // for(intervals val:inter){
        //    System.out.println(val.start+" "+val.end);
        // } 

        ArrayList<intervals> ans = new ArrayList<intervals>();
        Stack<intervals> stack = new Stack<intervals>();

        // todo Filling and Editing stack at the same time.
        for(int i = 0; i < inter.length;i++){
            if(stack.isEmpty()){
                stack.push(new intervals(inter[i].start,inter[i].end));
            }
            else{
                intervals num1 = stack.pop();
                if(num1.end>=inter[i].start){
                    stack.push(new intervals(num1.start,Math.max(num1.end,inter[i].end)));
                }
                else{
                    ans.add(num1);
                    stack.push(new intervals(inter[i].start,inter[i].end));
                }
            }
        }
        //todo Filling the arraylist with the remaining elements.
        while(!stack.isEmpty()){
            ans.add(stack.pop());
        }
        return ans;
    }
    public static void main(String[] args) {
        intervals[] inter = new intervals[10];
        inter[0] = new intervals(22,28);
        inter[1] = new intervals(1,8);
        inter[2] = new intervals(25,27);
        inter[3] = new intervals(14,19);
        inter[4] = new intervals(27,30);
        inter[5] = new intervals(5,12);

        // [[2,3],[2,2],[3,3],[1,3],[5,7],[2,2],[4,6]]
        // [[1,3],[2,6],[8,10],[15,18]]
        inter[6] = new intervals(1,3);
        inter[7] = new intervals(2,6);
        inter[8] = new intervals(8,10);
        inter[9] = new intervals(15,18);

        // for(intervals val:inter){
        //    System.out.println(val.start+" "+val.end);
        // } 
        ArrayList<intervals> ans = overlapping(inter);

        for(intervals val:ans){
            System.out.println(val.start+" "+val.end);
        }
    }
    //! this is using comaparable interface.
    public static class intervals implements Comparable<intervals>{
        int start, end;
        public  intervals(int start, int end){
            this.start = start; 
            this.end = end;
        }

        //? If the class implements Comparable interface then this method should be implemented/Called.
        //todo And while using comparator we do not need to implement this method or the camparable interface.
        @Override
        public int compareTo(intervals obj) {    
            if(this.start!=obj.start)return this.start-obj.start; 
            else return this.end-obj.end ;
        }
    }
}
