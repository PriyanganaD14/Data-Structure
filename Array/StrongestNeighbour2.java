import java.util.Scanner;
import java.lang.Math;

class StrongestNeighbour2 {
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

        maximumAdjacent(sizeOfArray,arr);
    }

    public static void maximumAdjacent(int n,int ar[]){
        for(int i=0;i<n-1;i++){
            System.out.println("output :"+(Math.max(ar[i],ar[i+1])+" "));
        }
    }
}