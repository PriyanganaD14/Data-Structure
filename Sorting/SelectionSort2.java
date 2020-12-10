import java.util.Scanner;

class SelectionSort2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int sizeOfArray=sc.nextInt();

        System.out.println("Enter the array :");
        int arr[]=new int[sizeOfArray];
        for(int i=0;i<sizeOfArray;i++){
            int x=sc.nextInt();
            arr[i]=x;
        }  

        selectionSort(arr);
        sc.close();
    }

    public static void selectionSort(int arr[]){

        int n=arr.length;

        //for pass the elements
        for(int i=0;i<n-1;i++){

        //for find the min element from unsorted sub array

        int min=i;
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[min]){
                //update the min value
                min=j;
            }
        }

        //swap
        if(min != i){
            int temp;
            temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }


        printArray(arr,n);
    }


    public static void printArray(int ar[],int n){


        System.out.println("Selection Sort :");

        for(int i=0;i<n;i++){

            System.out.print(ar[i]+" ");
        }
    }
    
}
