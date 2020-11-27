import java.util.Arrays;
import java.util.Scanner;

//Time Complexity : O((n+m) log(n*m))


/**
 * MergeTwoSortedArrayNaiveSolution
 */
public class MergeTwoSortedArrayNaiveSolution {

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


        getResult(arr,brr,n,m);

        sc.close();

    }

    public static void getResult(int a[],int b[], int n, int m){
      
        //create an empty array.
        int c[]=new int[n+m];

        //store the 1st array elements.
        for(int i=0;i<n;i++){
            c[i]=a[i];
        }

        //store the 2nd array elements.
        for(int i=0;i<m;i++){
            c[n+i]=b[i];
        }

        //sort

        Arrays.sort(c);

        //print
        for(int i=0;i<n+m;i++){
            System.out.print(c[i]+" ");
        }



    }

    
}