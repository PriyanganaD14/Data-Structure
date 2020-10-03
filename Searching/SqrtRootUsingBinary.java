import java.util.Scanner;

public class SqrtRootUsingBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number : ");
        long n=sc.nextLong();

        System.out.println("Output : "+getResult(n));
        sc.close();
    }

    public static long getResult(long x){

        long low=0,high=x,ans=-1;

        while(low<=high){

            long mid=(low+high)/2;

            long msq=mid*mid;

            if(msq==x){
                return mid;
            }

            else if(msq>x){
                high=mid-1;
            }
            else{
                low=mid+1;
                ans=mid;
            }
        }


        return ans;

    }
    
}
