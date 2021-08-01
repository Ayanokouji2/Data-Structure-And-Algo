package Java.GoG;
import java.util.*;
public class SmallestPos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = in.nextInt();
        System.out.println("Enter the element ");
        int[] arr = new int[size];
        for(int i = 0; i <size; i++){
            arr[i] = in.nextInt();
        }
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<size;i++){
            if(arr[i]>0)
            a.add(arr[i]);
        }
        int min =1;
        for(int i =0;i<a.size();i++){
            if(a.contains(min)){
                min++;
                continue;
            }
            else{
                System.out.println(++min);
            } 
        }
        System.out.println(min);
        in.close();
    }
}
