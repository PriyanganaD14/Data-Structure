//Time Complexity: O(n*2)

//Auxiliary Space: O(1)

import java.util.Scanner;

/**
 * InsertionSort
 */
public class InsertionSort {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int sizeOfArray=sc.nextInt();

        System.out.println("Enter the array :");
        int arr[]=new int[sizeOfArray];
        for(int i=0;i<sizeOfArray;i++){
            int x=sc.nextInt();
            arr[i]=x;
        }  

        insertSort(arr);
        sc.close();
    }

    public static void insertSort(int ar[]){

        int n=ar.length;

        for(int i=1;i<n;i++){

            int key=ar[i];
            int j=i-1;

            while(j>=0 && ar[j]>key){

                ar[j+1]=ar[j];
                j=j-1;
            }

            ar[j+1]=key;
        }

        printArray(ar,n);
    }

    public static void printArray(int ar[],int n){


        System.out.println("Insertion Sort :");

        for(int i=0;i<n;i++){

            System.out.println(ar[i]+" ");
        }
    }
}