import java.util.Scanner;

class InsertAtEnd {
    public static void main(String args[]){

    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the size of the Array :");
    int sizeOfArray=sc.nextInt();

    System.out.println("Enter the Array :");
    int arr[]=new int[sizeOfArray];               //input an array
    for(int i=0;i<sizeOfArray-1;i++){
        int x=sc.nextInt();
        arr[i]=x;
    }
    System.out.println("Enter the insert Element :");
    int element=sc.nextInt();

    insert(arr,sizeOfArray,element);

    System.out.println("Modified Array:");
    for(int i=0;i<sizeOfArray;i++){
         System.out.println(arr[i]+ " ");       //printing the array
    }

    }

    public static void insert(int ar[],int n,int x){
        ar[n-1]=x;
       
        return;
    }
    
}