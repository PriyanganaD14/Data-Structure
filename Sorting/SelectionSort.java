//Time Complexity : O(n2)
//Aux Space Complexity : O(1)

import java.util.Scanner;

public class SelectionSort {

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

        selectionSort(arr);
        sc.close();
    }

    public static void selectionSort(int ar[]){

        int n=ar.length;

        for(int i=0;i<n;i++){

            int minIndex=i;


            for(int j=i+1;j<n;j++){

                if(ar[j]<ar[minIndex]){

                    minIndex=j;
                }

              //  int temp=ar[minIndex];
              //  ar[minIndex]=ar[i];
              //  ar[i]=temp;

              int temp=ar[minIndex];
              ar[minIndex]=ar[i];
              ar[i]=temp;

            }
        }

        printArray(ar,n);
    }

    public static void printArray(int ar[],int n){


        System.out.println("Selection Sort :");

        for(int i=0;i<n;i++){

            System.out.println(ar[i]+" ");
        }
    }
    
}