import java.util.Scanner;
import java.lang.Math;

class TowerOfHanoi {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of disk :");
    int n=sc.nextInt();
    System.out.println(toh(n,1,2,3));
    }

    

    public static long toh(int N, int from, int to, int aux) {
        if(N==1){
            System.out.println("move disk 1 from rod "+ from +" to rod"+ to);
           // return 1;
           return (long)((Math.pow(2,N))-1);
        
        }
        else{
             toh(N-1,from,aux,to);
             System.out.println("move disk "+N+" from rod "+ from +" to rod"+ to);
             toh(N-1,aux,to,from);
        }
       
        return (long)((Math.pow(2,N))-1);
        // Your code here
    }
   // System.out.println((Math.pow(N,2))-1);

   // System.out.println((Math.pow(N,2))-1));
    }
    
