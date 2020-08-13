import java.util.Scanner;

class LuckyNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Searching number :");
        int n=sc.nextInt();
        //Solution s=new Solution(n);
        System.out.println(Solution.isLucky(n));
    }
}

class Solution{


    static int counter=2;
    
    static boolean isLucky(int n){
        

        if(counter>n){
            return true;
        }
         if(n%counter==0){
             return false;
         }
         int nv=n;            //nv=new value.
         nv=nv-(nv/counter);
         counter++;
         return(isLucky(nv));

        

    }
    
    
}