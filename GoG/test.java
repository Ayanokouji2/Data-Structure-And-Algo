package Java.GoG;

public class test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        StringBuilder str = new StringBuilder();
        int i = arr[0];
        String s = String.valueOf(i);
        String s1 = String.valueOf(arr[1]);
        // s+=s.concat(s1);
        str.append(s);
        str.append(s1);
        StringBuilder str1 = new StringBuilder();
        str1.append(s1+s);
        System.out.println( str1.compareTo(str));
        // String ne = str.toString();
        // int num1 = Integer.valueOf(ne);
        System.out.println(str1);
        System.out.println(s);
        str.setLength(0);
        s = String.valueOf(arr[2]);
        str.append(s);
        System.out.println(str);
    }
}
