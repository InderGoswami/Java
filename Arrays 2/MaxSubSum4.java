import java.util.*;
public class MaxSubSum4{
    static int MaxSubarraySum(int arr[]){//kadane' algo
    /*postive+positive , Larger positve- Smaller negative are good cases(return postitive)
    *but Smaller positive - larger negative is bad vase return a negative number
     * Acc to this algo if sum became negative assign it zero 
     * Traverse to each element , find current sum and max sum in each iteration
     * if CS became negative, make it zero
     * if CS became smaller than ms but remain postive, no need to make it zero
     * 
     */
        int cs=0;
        int ms=0;
        for(int i=0;i<arr.length;i++){
            cs+=arr[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(ms,cs);
        }
        return ms;
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