import java.util.Scanner;

class RodCutting {
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the length of the rod :");
     int n=sc.nextInt();
     System.out.println("a :");
     int a=sc.nextInt();
     System.out.println("b :");
     int b=sc.nextInt();
     System.out.println("c :");
     int c=sc.nextInt();
     System.out.println("Maximum cutting :");

     System.out.println(maxCutting(n,a,b,c));
    }

    public static int maxCutting(int n,int a,int b,int c){
        if(n==0){
            return 0;
        }
        if(n<0){
            return -1;
        }

        int res=Math.max(maxCutting(n-a,a,b,c),Math.max(maxCutting(n-b,a,b,c),maxCutting(n-c,a,b,c)));
        
        if(res==-1){
            return -1;
        }

        return (res+1);
    
    }
   
    
}