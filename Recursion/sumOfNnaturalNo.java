import java.util.Scanner;

class sumOfNnaturalNo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int N=sc.nextInt();
        System.out.println(naturalNo(N));
    }

    public static int naturalNo(int n) {
        int sum=0;

        if(n==0){                 // n==1,becoz when input is 0,then we get some error.
         return 0;
        }

        sum=n+naturalNo(n-1);

        return sum;
        
    }
    
}