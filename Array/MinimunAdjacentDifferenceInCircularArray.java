import java.util.Scanner;
import java.lang.Math;

class MinimunAdjacentDifferenceInCircularArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         
        System.out.println("Enter the size of the array :");
        int sizeOfArray=sc.nextInt();

        System.out.println("Enter the array :");
        int ar[]=new int[sizeOfArray];
        for(int i=0;i<sizeOfArray;i++){
            int x=sc.nextInt();
            ar[i]=x;
        }
    System.out.print("Output :"+minAddDiff(ar,sizeOfArray));
}

public static int minAddDiff(int arr[],int n){

    if(n<2){

        return -1;                               //because the loop has only one element,so no difference present
    }

    int res=(int)Math.abs(arr[1]-arr[0]);                        //diff between two adjacent element

    for(int i=2;i<n;i++){                        //starts from 3rd element

        res=Math.min(res,(int) Math.abs(arr[i]-arr[i-1]));                 //for checking the adjacent elemnt

    }

    res=Math.min(res,(int)Math.abs(arr[n-1]-arr[0]));                    //for checking the circular element(last index-first index)

    return res;

}

}