//Time Complexity : theta(root x)

import java.util.Scanner;

public class SqureRootNaive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();

       

        System.out.println("Output : "+ sqrtFloor(n));
        
        sc.close();
    }

    public static int sqrtFloor(int x){

        int i=1;

        while(i*i<=x){
            i++;
        }

        return (i-1);
    }
    
}
