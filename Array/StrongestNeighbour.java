//Window slidilng method-----------------

import java.util.Scanner;

class StrongestNeighbour {
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
        
        int k=2,j,max;                       //k=window size

        for(int i=0;i<n-1;i++){
            max=ar[i];
            for(j=1;j<k;j++){                         //for sliding the window length
                if(ar[j+i]>=max){
                    max=ar[j+i];
                }

            }

            System.out.println("output :"+max+" ");

        }
        
    }
    
}