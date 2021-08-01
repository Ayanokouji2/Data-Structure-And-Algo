package Java.HackerRank;

public class TaumANdBdday {
    public static long taumBday(int b, int w, int bc, int wc, int z) {
        // Write your code here
            long bp = Math.min(bc,wc+z);
            long wp = Math.min(wc,bc+z);
            long price = (b*bp)+(w*wp);
            return price;
    
    }
    public static void main(String[] args) {
        System.out.println(taumBday(81121308,2772464,720682,615826,14843));
    }
}
