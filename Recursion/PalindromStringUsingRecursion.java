import java.util.Scanner;

public class PalindromStringUsingRecursion {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=sc.nextLine();
        System.out.println(isPalindrom(str,0,str.length()-1));
    }

    public static boolean isPalindrom(String s,int start, int end) {
      if(start>=end){
          return true;
      }

      return(s.charAt(start)==s.charAt(end) && isPalindrom(s, start+1, end-1));
        
    }
    
}