import java.util.Scanner;

class ReverseArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int sizeOfArray=sc.nextInt();

        System.out.println("Enter the array :");
        int arr[]=new int[sizeOfArray];
        for(int i=0;i<sizeOfArray;i++){
            int x=sc.nextInt();
            arr[i]=x;
        }   

        System.out.println(" Reverse array : ");
        reverse(arr,sizeOfArray);
}

public static void reverse(int ar[],int n){

  /*  while(low<high){

        temp=ar[low];
        ar[low]=ar[high];
        ar[high]=temp;
        low++;
        high--;
    }  */

    for(int i=ar.length-1;i>=0;i--){
        System.out.println(ar[i]+ " ");
    }
}

}