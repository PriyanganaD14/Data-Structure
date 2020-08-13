import java.util.Scanner;
import java.lang.Math;

class PowerOfNumber {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Number :");
     int n=sc.nextInt();
     System.out.println("Enter the reverse Number :");
     int r=sc.nextInt();
     System.out.println("Ans :");
    System.out.println(power(n,r));
    }

    public static long power(int n,int r){
    
        long M=1000000007;
        
        if(r==1){
            return n;
        }

        else if(r%2==0){
            return power(n,r/2)%M * power(n, r/2)%M;
        }
        
    else if(r%2!=0){
        return (n%M)*power(n, (r-1))%M;
    }
    return 1;

    }
    
}