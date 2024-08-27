import java.util.*;
public class TwoD{
    public static boolean serach2D(int arr[][],int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    System.out.println("Key lies at "+ i + " row and "+ j +" column" );
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        //2 D array Representation:-
        /*Rows and columns starts from zero
         * 1.Rows:-Horizontal
         * 2.Columns-Veritical
         * For each cell we have unique combiation Row and column 
         * matrix[rows][col]
         */
        //Creation of 2 d matrix
        int arr[][]=new int[3][3];//matrix of 3 by 3
        //Total cells in matrix is equal to 9
        //Input
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //Output
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter the key");
        int key=sc.nextInt();
        System.out.println(serach2D(arr,key));
    }
}