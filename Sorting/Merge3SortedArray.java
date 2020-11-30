// Function is all right 

// But some error in class to return ArrayList




//Time Complexity : O(n+m+p)
//Aux Space Complexity : O(n+m+p)


import java.util.ArrayList;
import java.util.Scanner;

public class Merge3SortedArray {
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


        System.out.println("Enter the length of the 3nd array : ");
        int p=sc.nextInt();
        System.out.println("Enter the 3nd array elements : ");
        int crr[]=new int [m];
        for(int i=0;i<p;i++){
            int x=sc.nextInt();
            crr[i]=x;
        }

        sc.close();

        System.out.println("Output sorted array : ");
        //getResult(arr,brr,crr);



       // printFun(getResult(arr, brr, crr));

       printFun(new Merge3().getResult(arr, brr, crr));

   }

   static void printFun(ArrayList<Integer> list) {
       for (Integer x : list) {
           System.out.print(x + " ");
       }
   }

}

class Merge3 {
   ArrayList<Integer> getResult(int A[], int B[], int C[]) {


        ArrayList<Integer> res=new ArrayList<Integer>();

        int i=0,j=0,k=0;

        int n=A.length, m=B.length, p=C.length;

        while(i<n && j<m && k<p){

            /*
            if(A[i]<=B[j]){
                if(A[i]<=C[k]){
                    res.add(A[i++]);
                }
                else{
                    res.add(C[k++]);
                }
            }
            else{
                if(B[j]<=C[k]){
                    res.add(B[j++]);
                }
                else{
                    res.add(C[k++]);
                }
            }
            */
            if(A[i]<= B[j] && A[i]<=C[k]){
                res.add(A[i++]);
            }
            else if(B[j]<=A[i] && B[j]<=C[k])
            {
                res.add(B[j++]);
            }
            else{
                res.add(C[k++]);
            }
        }

        while(i<n && j<m){
            if(A[i]<B[j]){
                res.add(A[i++]);
            }
            else{
                res.add(B[j++]);
            }
        }

        while(i<n && k<p){
            if(A[i]<C[k]){
                res.add(A[i++]);
            }
            else{
                res.add(C[k++]);
            }
        }

        while(j<m && k<p){
            if(B[j]<C[k]){
                res.add(B[j++]);
            }
            else{
                res.add(C[k++]);
            }
        }

        while (i<n){
            res.add(A[i++]);
        }
        while(j<m){
            res.add(B[j++]);
        }
        while(k<p){
            res.add(C[k++]);
        }

        return res;
    }
    
}
