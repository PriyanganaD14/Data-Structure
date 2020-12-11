//Use Merge Function to slove this algo.
//Time Complexity : O(m+n)
//Aux Space Complexity : O(1)

import java.util.Scanner;

class IntersectionofTwoSortedArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the length of the 1st array : ");
        int n=sc.nextInt();
        System.out.println("Enter the 1st array : ");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            a[i]=x;
        }

        System.out.println("Enter the length of the 2nd array : ");
        int m=sc.nextInt();
        System.out.println("Enter the 2nd array : ");
        int b[]=new int[m];
        for(int i=0;i<m;i++){
            int x=sc.nextInt();
            b[i]=x;
        }

        sc.close();

        getResult(a,b,n,m);
    }

    public static void getResult(int a[], int b[],int n,int m){

        int i=0,j=0;

        while(i<n && j<m){

            //To avoid dublicate element present in same array.
            if(i>0 && a[i-1]==a[i]){
                continue;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else if(a[i]>b[j]){
                j++;
            }
            //To find Intersection element
            else if(a[i]==b[j]){
                System.out.print(a[i++]+" ");
            }
        }
    }

    
    
}
