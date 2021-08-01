package Java.College;
import java.util.Scanner;
public class MultiplicationMatrix {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter  size of FIRST array: ");
        int row1= in.nextInt();
        int col1= in.nextInt();
        System.out.println("Enter size of SECOND array: ");
        int row2= in.nextInt();
        int col2= in.nextInt();
        int[][] a= new int[row1][col1];
        int[][] b= new int[row2][col2];
        int[][] c= new int[row1][col2];
        int sum=0;
        if(col1==row2){
            System.out.println("Enter the element of FIRST array:");
            for(int i=0; i<row1; i++){
                for(int j=0; j<col1; j++){
                    a[i][j]=in.nextInt();
                }
            }
            System.out.println("Enter the elements of SECOND array:");
            for(int i=0; i<row2; i++){
                for(int j=0; j<col2; j++){
                    b[i][j]=in.nextInt();
                }
            }
            for(int i=0; i<row1; i++){
                for(int j=0; j<col2; j++){
                    for(int k=0; k<col1; k++){
                        sum += a[i][k]*b[k][j];
                    }
                    c[i][j] = sum;
                    sum=0;
                }
            }
            System.out.println("RESULTANT MATRIX:");
            for(int i=0; i<row1; i++){
                for(int j=0; j<col2; j++){
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }   
        }
        else{
            System.out.println("Multiplication is not possible!!!!!!");
        }
        in.close();
    }
}