package Java.HackerRank;

import java.util.HashMap;
import java.util.Map;

public class TimeInWords {
    public static String timeInWords(int h, int m) {
        // Write your code here
        Map<Integer,String> map = new HashMap<>();
            map.put(1,"one");
            map.put(2,"two");
            map.put(3,"three");
            map.put(4,"four");
            map.put(5,"five");
            map.put(6,"six");
            map.put(7,"seven");
            map.put(8,"eight");
            map.put(9,"nine");
            map.put(10,"ten");
            map.put(11,"eleven");
            map.put(12,"twelve");
            map.put(13,"thirteen");
            map.put(14,"fourteen");
            map.put(15,"quarter");
            map.put(16,"sixteen");
            map.put(17,"seventeen");
            map.put(18,"eighteen");
            map.put(19,"nineteen");
            map.put(20,"twenty");
            map.put(21,"twenty one");
            map.put(22,"twenty two");
            map.put(23,"twenty three");
            map.put(24,"twenty four");
            map.put(25,"twenty five");
            map.put(26,"twenty six");
            map.put(27,"twenty seven");
            map.put(28,"twenty eight");
            map.put(29,"twenty nine");
            map.put(30,"half");


            StringBuilder min = new StringBuilder();
            StringBuilder hrs = new StringBuilder();
            if(m == 0) {
                min.append(" o' clock");
                hrs.append(map.get(h));
                hrs.append(min);
                return hrs.toString();
            }
            else if(m>=1 && m<=30){
                min.append(map.get(m));
                if(m==1) min.append(" minute past ");
                else if(m!=30 && m!=15)min.append(" minutes past ");
                else min.append(" past ");
                hrs.append(map.get(h));
                min.append(hrs);
            }
            else{
                m=60-m;
                h=h+1;
                if(h>=12) h=h-12;
                if(m == 0) {
                    min.append(" o' clock");
                    hrs.append(map.get(h));
                    hrs.append(min);
                    return hrs.toString();
                }
                min.append(map.get(m));
                if(m==1) min.append(" minute to ");
                else if(m!=30 && m!=15)min.append(" minutes to ");
                else min.append(" to ");
                hrs.append(map.get(h));
                min.append(hrs);
            }
            
            return min.toString();

        }

        public static void main(String[] args) {
            int hour = 14;
            int minutes = 45;
            System.out.println(timeInWords(hour, minutes));
        }
}
