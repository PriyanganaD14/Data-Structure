import java.util.Scanner;

public class Count1sInASortedBinaryArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the length of the array : ");
        int n=sc.nextInt();

        System.out.println("Enter the sorted binary array : ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            arr[i]=x;
        }

        System.out.println("Total numbers of one : "+getResult(arr,n));

        sc.close();
    }
    

    public static int getResult(int arr[],int n){

        int low=0,high=n-1,mid;
        if(arr[0]==0 && arr[n-1]==0){
            return 0;
        }
        else if(arr[0]==1 && arr[n-1]==1){
            return n;
        }

        if(arr[0]==0){
            while(low<=high){
                mid=(low+high)/2;
                if(arr[mid]==0){
                    low=mid+1;
                }
                else{
                    if(mid==0 || arr[mid-1]==0){
                        return n-mid;
                    }
                    else{

                        high=mid-1;

                    }
                }
            }
        }

        else{
            while(low<=high){
                mid=(low+high)/2;

                if(arr[mid]==1){
                    low=mid+1;
                }
                else{
                    if(arr[mid-1]==1){
                        return mid;
                    }
                    else{
                        high=mid-1;
                    }
                }
            }
        }

        return 0;
    }
}
