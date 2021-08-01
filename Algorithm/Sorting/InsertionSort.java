package Java.Algorithm.Sorting;

public class InsertionSort {
    static int[] insertdatdick(int[] ass){
        for(int i=1;i<ass.length;i++){
            int j=i-1;
            int selected = ass[i];
            while(j>=0 && ass[j]>selected){
                ass[j+1] = ass[j];
                j--;
            }
            ass[j+1] = selected;                
        }
        return ass;
    }
    public static void main(String[] args) {
        int[] girls = {4,1,8,5,4,3,2};
        girls = insertdatdick(girls);
        for(int inserted:girls){
            System.out.print(inserted+"\s");
        }
    }
}
