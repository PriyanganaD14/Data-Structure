import java.util.Scanner;

public class BubbleSortInEfficientWay {
    
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

        bubbleSort(arr);

        sc.close();

}


public static void bubbleSort(int ar[]){
    int n=ar.length;

    for(int i=0;i<n-1;i++){

        int swapped=0;

        for(int j=0;j<n-i-1;j++){

            if(ar[j]>ar[j+1]){

                int temp=ar[j];
                ar[j]=ar[j+1];
                ar[j+1]=temp;

                swapped=1;
            }

            if(swapped==0){
                
                break;
            }
        }
    }

    printArray(ar,n);
    
}


public static void printArray(int ar[],int n){


    System.out.println("Bubble Sort :");

    for(int i=0;i<n;i++){

        System.out.println(ar[i]+" ");
    }
}

}