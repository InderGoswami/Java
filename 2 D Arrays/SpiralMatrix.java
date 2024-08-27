import java.util.*;
public class SpiralMatrix{
    static void spiralMatrix(int matrix[][]){
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;
        int total=matrix.length*matrix[0].length;
        int k=0;
        while(k<total){
            for(int i=startCol;i<=endCol;i++ ){
                System.out.print(matrix[startRow][i]+" ");
                k++;
            }
            startRow++;
            for(int i=startRow;i<=endRow;i++ ){
                System.out.print(matrix[i][endCol]+" ");
                k++;
            }
            endCol--;
            for(int i=endCol;i>=startCol;i-- ){
                System.out.print(matrix[endRow][i]+" ");
                k++;
            }
            endRow--;
            for(int i=endRow;i>=startRow;i-- ){
                System.out.print(matrix[i][startCol]+" ");
                k++;
            }
            startCol++;
            

        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows=sc.nextInt();
        System.out.println("Enter the number of columns");
        int col=sc.nextInt();
        int matrix[][]=new int[rows][col];
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        spiralMatrix(matrix);


    }
}