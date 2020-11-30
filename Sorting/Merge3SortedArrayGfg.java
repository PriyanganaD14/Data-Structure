// Function is all right 

// But some error in class to return ArrayList.

//Time Complexity : O(n+m+p)
//Aux Space Complexity : O(n+m+p)


import java.util.ArrayList;
import java.util.Scanner;



class Merge3SortedArrayGfg {

    static void printSorted(ArrayList<Integer> list){
        for(Integer x: list){
            System.out.println(x +" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
        int t=sc.nextInt();

        while(t-- >0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            int A[]=new int[a];
            int B[]=new int[b];
            int C[]=new int[c];


            for(int i=0;i<a;i++){
                A[i]=sc.nextInt();
            }

            for(int i=0;i<b;i++){
                B[i]=sc.nextInt();
            }

            for(int i=0;i<c;i++){
                C[i]=sc.nextInt();
            }

            new MergeThree();
            printSorted(MergeThree.merge3sorted(A, B, C));

            System.out.println();

            sc.close();
        }
    }
    
}

class MergeThree{
    static ArrayList<Integer> merge3sorted(int A[], int B[], int C[]){

        ArrayList<Integer> res=new ArrayList<Integer>();

        int i=0,j=0,k=0;

        int n=A.length, m=B.length, p=C.length;

        while(i<n && j<m && k<p){

            if(A[i]<=B[j] && A[i]<=C[k]){
                res.add(A[i++]);
            }
            else if (B[j]<=A[i] && B[j]<=C[k]){
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
             if (A[i]<C[k]){
                 res.add(A[i++]);
             }
             else{
                 res.add(C[k++]);
             }
        }

        while(j<m && k<p){
            if (B[j]<C[k]){
                res.add(B[i++]);
            }
            else{
                res.add(C[k++]);
            }
        }

        while(i<n){
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
