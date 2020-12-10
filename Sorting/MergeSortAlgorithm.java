import java.util.Scanner;

class MergeSortAlgorithm {
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

        System.out.println("Enter the l and r : ");
        int l=sc.nextInt();
        int r=sc.nextInt();


        System.out.println("Output : ");

        mergeSort(arr,l,r);

        printFunc(arr);

        sc.close();
    }

    public static void printFunc(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    

    public static void mergeSort(int arr[],int l,int r){

        if(r>l){    //check atleast for two elements

            // find mid
            int m=l+(r-l)/2;

//Divide

            //for left half
            mergeSort(arr, l, m);

            //for right half
            mergeSort(arr, m+1, r);


//Concer

            //for merge function
            mergeFunc(arr,l,m,r);
            
        }

    }

     //merge function

     public static void mergeFunc(int arr[],int l,int m,int r){

        // two newly created array length
        int n1=m-l+1;
        int n2=r-m;

        //two newly created array
        int left[]=new int[n1];
        int right[]=new int[n2];

        // Divide into two diff array

        // containing with left sided elements

        for(int i=0;i<n1;i++){
            left[i]=arr[l+i];
        }

        // containing with right sided elements

        for(int j=0;j<n2;j++){
            right[j]=arr[m+1+j];
        }

        int i=0,j=0,k=l;

        while(i<n1 && j <n2){

            if(left[i]<right[j]){
                arr[k++]=left[i++];
        
            }
            else{
                arr[k++]=right[j++];
        
            }
        }

        while(i<n1){
            arr[k++]=left[i++];
        
        }

        while(j<n2){
            arr[k++]=right[j++];

        }
     }
}
