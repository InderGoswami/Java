import java.util.*;
public class largestInArray{
    static int  largetArr(int arr[]){
        int ans=Integer.MIN_VALUE;//minus infinity
        for(int i=0;i<arr.length;i++){
            ans=Math.max(ans,arr[i]);
            
        }
        return ans;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(largetArr(arr));
        
    }
}