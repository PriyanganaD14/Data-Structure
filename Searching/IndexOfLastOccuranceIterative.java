//Time Complexity : O(log n)
//Space Complexity : O(1)


import java.util.Scanner;

class IndexOfLastOccuranceIterative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n=sc.nextInt();

        System.out.println("Enter the array elements : ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            arr[i]=x;
        }

        System.out.println("Enter the searching elements : ");
        int ele =sc.nextInt();

        sc.close();

        System.out.println("Output : "+lastocc(arr,n,ele));
    }

    public static int lastocc(int arr[],int n,int element){

        int low=0,high=n-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]>element){
                high=mid-1;
            }

            else if (arr[mid]<element){
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
