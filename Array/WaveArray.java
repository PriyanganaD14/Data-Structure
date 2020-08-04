import java.util.Collections;
import java.util.Scanner;

class WaveArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int sizeOfArray=sc.nextInt();

        System.out.println("Enter the array :");
        int ar[]=new int[sizeOfArray];
        for(int i=0;i<sizeOfArray;i++){
            int x=sc.nextInt();
            ar[i]=x;
        }  

        convertToWave(ar,sizeOfArray);

        for(int i=0;i<sizeOfArray;i++){
            System.out.println("Output"+ar[i]+" ");
        }
}

public static void convertToWave(int arr[],int n){

for(int i=0;i<n-1;i+=2){

    swap(arr,i,i+1);

}

}

public static void swap(int arr[],int a,int b){

    int temp;
    
    temp=arr[a];
    arr[a]=arr[b];
    arr[b]=temp;

    
}
}
