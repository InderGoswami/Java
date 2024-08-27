import java.util.*;
public class MaxSubSum2{
    static int MaxSubarraySum(int arr[]){
        int sum=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){//o(n2)
            sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                

               
                ans=Math.max(ans,sum);
            }
        }
        return ans;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size]; 
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(MaxSubarraySum(arr));
    }
}