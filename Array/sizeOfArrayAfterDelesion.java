import java.util.Scanner;

class sizeOfArrayAfterDelesion {
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

        System.out.println("Enter the deleted element :");
        int element=sc.nextInt();

        int s=arraySize(arr,sizeOfArray,element);

        System.out.println("Size of the array after delesion :"+s);

    }

    public static int arraySize(int ar[],int n,int ele){
       
        int i;                   //globaly declared for use inside the if statement

        for(i=0;i<n;i++){
            if(ar[i]==ele)
            break;
        }
        if(i==n)                    //element is not present
        {
            return n;               //previous size of the array
        }

        for(int j=i;j<n-1;j++){
            ar[j]=ar[j+1];
        }

        return n-1;
    }

    
    
}