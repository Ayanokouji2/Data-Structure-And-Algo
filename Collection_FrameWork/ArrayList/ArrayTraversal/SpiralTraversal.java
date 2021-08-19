package Java.Collection_FrameWork.ArrayList.ArrayTraversal;

//* In This Package We Will Try To Learn 2D Array Traversal.

import java.util.*;
public class SpiralTraversal {
    // public static void main(String[] args) throws Exception {
    //     Scanner in = new Scanner(System.in);
    //     int minr =0,minc =0;
    //     System.out.println("Enter size");
    //     int maxr = in.nextInt();
    //     int maxc = in.nextInt();
    //     int[][] arr = new int[maxr][maxc];
    //     System.out.println("Elements");
    //     for(int i=0;i<maxr;i++){
    //         for(int j=0;j<maxc;j++){
    //             arr[i][j] = in.nextInt();
    //         }
    //     }
    //     System.out.print("Answer -->");
    //     int tne = maxc*maxr; //tne -> Total Number of Element.
    //     int count =0;
    //     maxr--;
    //     maxc--;
    //     while(count<tne){
    //         // For Down Traversal
    //         for(int i=minr,j =minc;i<=maxr && count<tne;i++){
    //             System.out.print(arr[i][j]+" ");
    //             count++;
    //         }
    //         minc++;

    //         // For Right Right traversal
    //         for(int i = maxr,j=minc;j<=maxc && count<tne;j++){
    //             System.out.print(arr[i][j]+" ");
    //             count++;
    //         }
    //         maxr--;

    //         // For Up Traversal
    //         for(int i=maxr,j=maxc;i>=minr && count<tne;i--){
    //             System.out.print(arr[i][j]+" ");
    //             count++;
    //         }
    //         maxc--;

    //         // For Left Traversal
    //         for(int j=maxc,i = minr;j>=minc && count<tne;j--){
    //             System.out.print(arr[i][j]+" ");
    //             count++;
    //         }
    //         minr++;
    //     }

    //     in.close();
    // }

    public static void main(String[] args) {  // For CLock Spiral Traversal
        Scanner in = new Scanner(System.in);
        int c = 4;
        int r = 4;
        int matrix[][] = new int[r][c];
        for(int i=0;i<r;i++){
                    for(int j=0;j<c;j++){
                        matrix[i][j] = in.nextInt();
                    }
                }
        int minr =0;
        int maxr = r-1;
        int minc =0;
        int maxc = c-1;
        int tne = r*c;
        int count =0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(count<tne){
            // Left --> Right Moving
            for(int i=minr,j=minc;j<=maxc && count<tne;j++){
                ans.add(matrix[i][j]);
                count++;
            }
            minr++;
            
            // Top --> Bottom
            for(int i = minr,j=maxc;i<=maxr && count<tne;i++){
                ans.add(matrix[i][j]);
                count++;
            }
            maxc--;
            
            // Right --> Left
            for(int i=maxr,j=maxc;j>=minc && count<tne;j--){
                ans.add(matrix[i][j]);
                count++;
            }
            maxr--;
            
            // Bottom --> Top
            
            for(int i=maxr,j=minc;i>=minr && count<tne;i--){
                ans.add(matrix[i][j]);
                count++;
            }
            minc++;
        }
        
        System.out.println(ans);
        in.close();
    }
}
