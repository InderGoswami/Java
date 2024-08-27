import java.util.*;
public class MaxSubSum3{
    static int MaxSubarraySum(int arr[]){//Prefix array
        //prefix sum
        //new array will be created named as prefix array
        //In prefix array we will store sum till ith element
        int prefix[]=new int[arr.length];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            prefix[i]=sum;
        }
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                //start index - i
                //end end - j
                //sum of subarray will be
                if(i==0){
                    sum=prefix[j];
                }
                else{
                    sum=prefix[j]-prefix[i-1];
                }
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