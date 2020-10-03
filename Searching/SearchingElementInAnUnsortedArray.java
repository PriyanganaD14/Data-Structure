//Linear Search
//Time Complexity : O(n).

import java.util.Scanner;

public class SearchingElementInAnUnsortedArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n=sc.nextInt();
        System.out.println("Enter the array : ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            arr[i]=x;
        }

        System.out.println("Enter the searching element : ");
        int s=sc.nextInt();

        sc.close();

        System.out.println("Output : "+search(arr,n,s));
    }

    public static int search(int arr[],int n,int s){

        for(int i=0;i<n;i++){
            if(arr[i]==s){
                return i;
            }
        }

        return -1;
    }
    
}
