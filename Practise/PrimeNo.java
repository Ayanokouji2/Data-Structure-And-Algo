package Java.Practise;

import java.util.Scanner;

public class PrimeNo {
    static boolean isPrime(int num ){
        if(num ==1 || num ==0)return false;
        if(num == 2 || num == 3 || num == 5 || num == 7 || num ==11)return true;
        if(num%2!=0 && num%3!=0 && num%5!=0 && num%7!=0 && num%11!=0)return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(isPrime(in.nextInt()));
        }
        in.close();
    }
}
// ?2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 53 61 67 71 73 79 83 89 97 101 103 107 109 113 127 131 137 139 149 151 157 163 167 173 179 181 191 193 197 199
//*4 6 8 9 10 12 14 15 16 18 20 21 22 24 25 26 27 28 30 32 33 34 35 36 38 39 40 42 44 45 46 48 49 50