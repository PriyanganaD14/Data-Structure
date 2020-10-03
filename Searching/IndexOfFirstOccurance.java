//Sorted Array
//Duplicated element present
//Linear Search
//Naive Solution
//Time Complexity : O(n)



import java.util.Scanner;

public class IndexOfFirstOccurance {
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

        System.out.println("enter the input element : ");
        int x=sc.nextInt();

        sc.close();

        System.out.println("Output index : "+firstOcc(arr,n,x));


    }

    public static int firstOcc(int arr[],int n,int x){

        for(int i=0;i<n;i++){
            if(arr[i]==x){
                return i;
            }
        }

        return -1;
    }
    
}
