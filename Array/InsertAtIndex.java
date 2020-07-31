import java.util.Scanner;

class InsertAtIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array size :");
        int sizeOfArray=sc.nextInt();

        System.out.println("Enter the Array :");
        int arr[]=new int[sizeOfArray];
        for(int i=0;i<sizeOfArray-1;i++){
            int x=sc.nextInt();
            arr[i]=x;
        }

        System.out.println("Enter the inserting element's index :");
        int insertingindex=sc.nextInt();

        System.out.println("Enter the inserting element :");
        int element=sc.nextInt();

        insertAtIndex(arr,sizeOfArray,insertingindex,element);


        System.out.println("Modified Array :");
        for(int i=0;i<sizeOfArray;i++){
            System.out.println(arr[i]+" ");
        }
        
    }

    public static void insertAtIndex(int ar[],int n,int index,int x){
        for( int i=n-1;i>index;i--){
          ar[i]=ar[i-1];
        }
      
        ar[index]=x;
        ++n;
        return;
    }
    
}