package Java.Algorithm.Recursion;

public class TowerOfHanoi {

    static void toh(int num_disc,char S, char A, char D){
        if(num_disc==0) return;
        toh(num_disc-1, S, D, A);
        System.out.print(S +" --> " +D + "  \s");
        toh(num_disc-1, A, S, D);
    }
    public static void main(String[] args) {
        int no_disc = 3;
        char a = 'B';
        char d = 'C';
        char s = 'A';
        toh(no_disc,s,a,d);
    }
}
