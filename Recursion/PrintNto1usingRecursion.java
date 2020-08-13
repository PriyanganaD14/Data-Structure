import java.util.Scanner;

class PrintNto1usingRecursion{
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
        System.out.print(N+" ")    ;
        print(N-1);
    
    }


}