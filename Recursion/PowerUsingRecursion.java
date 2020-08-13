import java.util.Scanner;

class PowerUsingRecursion {
public static void main(String args[])  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number :");
    int N=sc.nextInt();
    System.out.println("Enter thev power :");
    int R=sc.nextInt();
    System.out.println("Ans :");
    System.out.println(recursivePower(N,R));
}

public static int recursivePower(int n,int r){
    if(r==0){
        return 1;
    }
     return n* recursivePower(n, r-1);
}

}