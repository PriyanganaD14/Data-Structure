import java.util.Scanner;

class MergeFunctionOfMergeSort {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the length of the array : ");
        int n=sc.nextInt();

        System.out.println("Enter the array elements : ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            arr[i]=x;
        }

        System.out.println("Enter the l,m,r : ");
        int l=sc.nextInt();
        int m=sc.nextInt();
        int r=sc.nextInt();

        System.out.println("Output : ");
        getResult(arr, l, m, r);

        sc.close();
        
    }

    public static void getResult(int arr[],int l,int m,int r){
 
        //lengths of two separeted array.
        int n1=m-l+1;
        int n2=r-m;
        
        //create two array
        int left[]=new int[n1];
        int right[]=new int[n2];

        // Divide the array 
        for(int i=0;i<n1;i++){
            left[i]=arr[l+i];
        }

        for(int j=0;j<n2;j++){
            right[j]=arr[m+1+j];
        }

        //concer
        int i=0,j=0,k=l;

        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
                System.out.print(arr[k-1]+" ");
            }
            else
            {
                arr[k++]=right[j++];
                System.out.print(arr[k-1]+" ");
            }
        }

        while(i< n1){
            arr[k++]=left[i++];
            System.out.print(arr[k-1]+" ");

        }
        while(j<n2){
            arr[k++]=right[j++];
            System.out.print(arr[k-1]+" ");
        }
    }
    
}
