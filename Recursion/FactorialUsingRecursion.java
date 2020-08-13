import java.util.Scanner;

public class FactorialUsingRecursion {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        System.out.println(fact(n));
    }

    public static int fact(int n){
        if(n==0){
            return 1;                             //if n=5, 5*4*3*2*1 ,but don't return 0.
        }
        return n*fact(n-1);

        
    }
    
}