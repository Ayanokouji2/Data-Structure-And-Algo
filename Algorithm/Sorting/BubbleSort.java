package Java.Algorithm.Sorting;

public class BubbleSort {
    static int[] bubblebuttsort(int butts[]){
        int buttsize = butts.length;
        while(buttsize>0){
            for(int i=1; i<butts.length;i++){
                if(butts[i-1]>butts[i]){
                    int ass = butts[i];
                    butts[i] = butts[i-1];
                    butts[i-1] = ass;
                }
            }
            buttsize--;
        }
        return butts;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,5,6};
        arr = bubblebuttsort(arr);
        for(int butt: arr){
            System.out.print(butt+"\s");
        }
    }
}
