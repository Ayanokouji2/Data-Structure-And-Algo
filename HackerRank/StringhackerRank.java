package Java.HackerRank;

public class StringhackerRank {
    public static String hackerrankInString(String s) {
        // Write your code here
            String str = "hackerrank";
            int i =0;
            int j =0;
            if(str.equals(s))return "YES";
            if(str.length()>s.length()) return "NO";
            
            while(i<str.length() && j<s.length()){
                if(str.charAt(i)==s.charAt(j)){
                    i++;
                    j++;
                }
                else if(i>0 && (str.charAt(i-1)==s.charAt(j))){
                    j++;
                }
                else j++;
            }
            while(j<s.length()){
                if(str.charAt(i-1)==s.charAt(j))j++;
                j++;
            }
            return (i>=str.length())?"YES":"NO";
    }
        public static void main(String[] args) {
            System.out.println(hackerrankInString("hereiamstackerrank"));
        }
}
// !Test Cases for this codee.
/*
hereiamstackerrank 
knarrekcah                   
hackerrank
hackeronek
abcdefghijklmnopqrstuvwxyz
rhackerank
ahankercka
hacakaeararanaka
hhhhaaaaackkkkerrrrrrrrank
crackerhackerknar
hhhackkerbanker*/
// ? Answer of the Test cases .
/*
YES
NO
YES
NO
NO
NO
NO
YES
YES
NO
NO */
