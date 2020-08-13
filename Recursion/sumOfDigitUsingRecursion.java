import java.util.Scanner;

class sumOfDigitUsingRecursion {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int N=sc.nextInt();
        System.out.println(sumOfDigit (N));
    }

    public static int sumOfDigit(int n) {
        if(n<10){
            return n;
        }

        return sumOfDigit(n/10)+(n%10);
        
    }
}