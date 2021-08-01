package Java.HackerRank;

//* Same As Just Greater then Number Same Algo.

public class BiggerIsGreater {
    public static String biggerIsGreater(String w) {
        char[] array = w.toCharArray();
        int start =array.length-2;
        int end = array.length-1;

        while(start>=0 && array[start]>=array[start+1])start--;
        if(start==-1)return "no answer";
        while(array[start]>=array[end])end--; 

        char temp = array[start];
        array[start] = array[end];
        array[end] = temp;

        String s = String.valueOf(array);
        String str = s.substring(0,start+1);
        StringBuilder sb = new StringBuilder();
        for(int i = array.length-1; i>=start+1; i--){
            sb.append(array[i]);
        }
        str+=sb.toString();    

        return str;
    }
    public static void main(String[] args) {
        System.out.println(biggerIsGreater("fedcbabcd"));
    }
}
/* lmno
dcba
dcbb
abdc
abcd
fedcbabcd*/