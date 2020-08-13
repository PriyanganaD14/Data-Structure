import java.util.Scanner;

class PowerSubSet {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=sc.nextLine();
        powerSet(str,0,"");
        
    }

    public static void powerSet(String s,int index,String current){
       int n=s.length();
       
       if(index==n){
           System.out.println(current);
          return;
       }
      

       powerSet(s, index+1, current);
       powerSet(s, index+1, current+s.charAt(index));

    }
    
}