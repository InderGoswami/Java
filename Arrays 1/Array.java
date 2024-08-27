import java.util.*;
public class Array{
    //Arrays are passed by reference
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static float printAvg(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum/arr.length;
    }
    static void updateArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]++;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //Arrays store data of same data type placed in contingous fashion
        //Creating an array
        //dt arrName[]=new dt[size];
        int arr[]=new int[5];//zeros are present at each index
        String fruits[]={"Apple","Banana"};//Intialization has to be done along with intialization in this way
        int numbers[];//declaration
        numbers=new int[10];//Initialization
        //Array has fixed size.It can't be changed once declared
        char alpha[]={'a','b','c'};
        //Input
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //output
       printArray(arr);
       //updation
       arr[0]=100;
       arr[1]++;
       printArray(arr);
       System.out.println(printAvg(arr));
       updateArr(arr);
       printArray(arr);//pass by referece in case of arrays

    }
}