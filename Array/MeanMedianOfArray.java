import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

class MeanMedianOfArray {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int sizeOfArray=sc.nextInt();

        System.out.println("Enter the array :");
        int arr[]=new int[sizeOfArray];
        for(int i=0;i<sizeOfArray;i++){
            int x=sc.nextInt();
            arr[i]=x;
        }

        System.out.println("mean="+mean(arr,sizeOfArray));

        System.out.println("median ="+median(arr,sizeOfArray));

        
    }

    public static int mean(int ar[],int n){

        int sum=0;

        for(int i=0;i<n;i++){
          sum=sum+ar[i]  ;
        }

        int mean=sum/n;

        return(int)Math.floor (mean);

    }

    public static int median(int ar[],int n){

        Arrays.sort(ar);                      //sorting the array
        
        if(n%2!=0){
            return (int)Math.floor(ar[n/2]);
        }

        if(n%2==0){
            return (int)Math.floor ((ar[(n-1)/2] + ar[n/2])/2);
        }

        return -1;
    }
    
}