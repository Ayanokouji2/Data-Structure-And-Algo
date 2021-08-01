package Java.HackerRank;

import java.util.*;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class PDFviewer {
    public static int designerPdfViewer(List<Integer> h, String word) {
 
            
            int num =97;
            Map<Character,Integer> Index = new HashMap<>();
            for(int i=0;i<26;i++){
                char alphabet = (char)num;
                Index.put(alphabet,h.get(i));
                num++;
            }
            char[] array = word.toCharArray();
            
            int[] arr = new int[word.length()];
            for(int j=0;j<array.length;j++ ){

                arr[j] = Index.get(array[j]);
                
            }
            Arrays.sort(arr);
            System.out.println(Index);
            int result = arr[array.length-1]*(arr.length);
            return result;
           
        }

        public static void main(String[] args) {
            Integer[] array = {1 ,3 ,1 ,3 ,1 ,4 ,1 ,3 ,2 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5, 5, 7};
            List<Integer> h = Arrays.asList(array);
            System.out.println(designerPdfViewer(h,"zaba"));
        }
}
