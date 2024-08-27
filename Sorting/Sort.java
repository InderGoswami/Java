import java.util.*;
public class Sort{
    static void bubbleSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr.length-i;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
    }
    static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int temp=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[temp]>arr[j]){
                    temp=j;

                }
            }
            int x=arr[temp];
            arr[temp]=arr[i];
            arr[i]=x;


        }

    }
    static void insertionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){ 
            int j=i+1 ;
            while(j!=0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
            }
        }
    }
    static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        insertionSort(arr);
        printArr(arr);
        

    }
}