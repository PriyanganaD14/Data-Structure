//----------Wrong code----------



import java.util.Scanner;

class DigitalRoot {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number :");
     int N=sc.nextInt();
     System.out.println(digitalRoot(N));
        
    }

    public static int digitalRoot(int n){
        if(sumOfDigit(n)>9){
            return digitalRoot(sumOfDigit(n));
        }
        else{
            return sumOfDigit(n);
        }
    }

    private static int sumOfDigit(int n) {
        if(n/10==0){
            return n;
        }
        else{
            return n+sumOfDigit(n/10);
        }
    }
}