//Time Complexity : O(log n)
//Space Complexity : O(1)

import java.util.Scanner;

class IndexOfFirstOccuranceIterative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the length of the array : ");
        int n=sc.nextInt();
        System.out.println("Enter the array elements : ");
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            arr[i]=x;
        }

      

        System.out.println("Enter the searching element : ");
        int ele=sc.nextInt();

        sc.close();

        System.out.println("Output : "+firstOcc(arr,n,ele));
    }

    public static int firstOcc(int arr[],int n,int element){

        int low=0, high =n-1;

        while(low<=high){
            int mid =(low+high)/2;

            if(arr[mid]>element){
                high =mid-1;
            }

            else if(arr[mid]<element){
                low=mid+1;
            }

            else{
                if(mid==0 || arr[mid]!=arr[mid-1]){
                    return mid;
                }
                else{
                    high =mid -1;
                }
            }
        }

        return -1;
    }
    
}
