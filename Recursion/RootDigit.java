import java.util.Scanner;

class RootDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int N=sc.nextInt();
        System.out.println(digitalRoot(N));
    }
    
    public static int digitalRoot(int x){
        if(x<10){
        return x;
        }
        else{
            x=x%10+digitalRoot(x/10);
            return digitalRoot(x);
        }

    }
}