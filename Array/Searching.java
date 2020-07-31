import java.sql.Array;
import java.util.Scanner;

class Searching{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int sizeOfArray=sc.nextInt();

        System.out.println("Enter the Array :");
        int arr[]=new int[sizeOfArray];               //creating an array.
        for(int i=0;i<sizeOfArray;i++){
            int x=sc.nextInt();
            arr[i]=x;
        }
        System.out.println("Enter the Searching Element :");
        int element=sc.nextInt();
        
        System.out.println("Enter the index of Searching element :");

        System.out.println(search(arr,sizeOfArray,element));
    }

    public static int search(int ar[],int n,int element){
         for(int  i=0;i<n;i++){
             if(ar[i]==element)
              return i;
         }
         return -1;
    }
}