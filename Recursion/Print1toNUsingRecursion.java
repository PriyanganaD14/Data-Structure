import java.util.Scanner;

class Print1toNusingRecursion{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int N=sc.nextInt();
        print(N);

    }

    public static void print(int N){
        if(N==0){
            return;
        }
        print(N-1);
        System.out.print(N+" ");
    
    }


}