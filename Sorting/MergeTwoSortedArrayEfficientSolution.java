//Time complexity : O(n+m)


import java.util.Scanner;

public class MergeTwoSortedArrayEfficientSolution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enthe the length of the 1st array : ");
        int n=sc.nextInt();
        System.out.println("Enter the 1st array elements : ");
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            arr[i]=x;
        }

        System.out.println("Enter the length of the 2nd array : ");
        int m=sc.nextInt();
        System.out.println("Enter the 2nd array elements : ");
        int brr[]=new int [m];
        for(int i=0;i<m;i++){
            int x=sc.nextInt();
            brr[i]=x;
        }


        System.out.println("Output : ");
        getResult(arr,brr,n,m);

        sc.close();

        
    }

    public static void getResult(int a[],int b[],int n, int m){

        int i=0,j=0;

        while(i<n && j<m){
            if(a[i]<b[j]){
                System.out.print(a[i++]+" ");
            }

            else{
                System.out.print(b[j++]+" ");
            }
        }

        while(i<n){
            System.out.print(a[i++]+" ");
        }

        while(j<m){
            System.out.print(b[j++]+" ");
        }
    }
    
}
