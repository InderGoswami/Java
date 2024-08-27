import java.util.*;
public class BinarySearch{
    static int bS(int arr[],int key){
        int s=0;
        int e=arr.length-1;
        
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int key;
        System.out.println("Enter the key");
        key=sc.nextInt();
        System.out.println(bS(arr,key));
        
    }
}