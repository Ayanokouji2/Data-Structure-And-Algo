package Java.HackerRank;

import java.util.*;

public class SparshArray{

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        
            List<Integer> ans = new LinkedList<>();
            int count =0;
            // String[] array = new String[strings.size()];
            // array = strings.toArray(array);
            // String[] answer = new String[queries.size()];
            // answer = strings.toArray(answer);
            // for(int i=0;i<array.length;i++){
            //     for(int j =0;j<answer.length;j++){
            //         if(answer[i]==array[j]){
            //             count++;
            //         }
            //     }
            //     ans.add(count);
            // }


            for(int i=0;i<queries.size();i++){
                count=0;
                for(int j=0;j<strings.size();j++){
                    if(queries.get(i).equals(strings.get(j))){
                        count++;
                    }
                }
                ans.add(count);
            }
            return ans;
        }

        public static void main(String[] args) {
            List<String> strings = new LinkedList<>();
            List<String> queries = new LinkedList<>();
            strings.add( "aba");
            strings.add("baba");
            strings.add("aba");
            strings.add("xzxb");
            queries.add("aba");
            queries.add("xzxb");
            queries.add("ab");
            System.out.println("Result: "+ matchingStrings(strings,queries) );
          
        }
}
// 4
// aba
// baba
// aba
// xzxb
// 3
// aba
// xzxb
// ab

// 3
// def
// de
// fgh
// 3
// de
// lmn
// fgh