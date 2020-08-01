//Tme Complexity: theta(n)
//Space Complexity:theta(1)

import java.util.Scanner;

class RemoveDublicateElementSortedArray2 {
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

       System.out.println("Size of Array : "+ removeDublicacy(arr,sizeOfArray));


    }

    public static int removeDublicacy(int ar[],int n){

        int res=1;
        System.out.println("Array with out dublicate element :"+ar[0]);

        for(int i=1;i<n;i++){                                          
            if(ar[i]!=ar[res-1]){
                ar[res]=ar[i];
                System.out.println("Array with out dublicate element :"+ar[i]+" ");
                res++;
            }
        }


        return res;
    }
}