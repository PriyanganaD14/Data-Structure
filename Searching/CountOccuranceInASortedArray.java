import java.util.Scanner;

public class CountOccuranceInASortedArray {
   public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);

       System.out.println("Enter the length of the array : ");
       int n=sc.nextInt();
       System.out.println("Enter the array : ");
       int arr[]=new int [n];
       for(int i=0;i<n;i++){
           int x=sc.nextInt();
           arr[i]=x;
       }

       System.out.println("Enter the searching element which ocurance count : ");
       int ele=sc.nextInt();

       System.out.println("Output : "+getResult(arr,n,ele));

       sc.close();
   } 

   public static int getResult(int arr[],int n,int ele){

    int first=firstOcc(arr,n,ele);

       if(first==-1){
           return 0;
       }

       else{
           return (lastOcc(arr,n,ele)-first+1);
       }
   }

   public static int firstOcc(int arr[],int n,int ele){

    int low=0,high=n-1;

    while(low<=high){
        int mid=(low+high)/2;

        if(arr[mid]>ele){
            high=mid-1;
        }
        else if(arr[mid]<ele){
            low=mid+1;
        }

        else{
            if(mid==0 || arr[mid-1]!=arr[mid]){
                return mid;
            }
            else{
                high=mid-1;
            }
        }

        
    }


    return -1;
   }

   public static int lastOcc(int arr[],int n,int ele){

    int low=0,high=n-1;

    while(low<=high){
        int mid=(low+high)/2;

        if(arr[mid]>ele){
            high=mid-1;
        }

        else if(arr[mid]<ele){
            low=mid+1;
        }

        else{
            if(mid==n-1 || arr[mid]!=arr[mid+1]){
                return mid;
            }
            else{
                low=mid+1;
            }
        }
    }

    return -1;
   }
}
