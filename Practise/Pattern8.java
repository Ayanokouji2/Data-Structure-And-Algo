package Java.Practise;


import java.util.Scanner;
public class Pattern8{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter odd number only ");
        int num = in.nextInt();
        int m= num/2;
        int n=num;
        for(int i=1;i<=num/2;i++){
            for(int j=num/2;j>=i;j--){
                System.out.print("* ");
            }
            for(int k=(num/2)-1;k<m;k++){
                System.out.print("  ");
            }
            m=m+2;
            
            
              for(int j=num/2;j>=i;j--){
                  System.out.print("* ");
               }
            

            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=num/2;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
             for(int k=n-1;k>i;k--){
                System.out.print("  ");
            }
            n--;
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        in.close();
    }
}