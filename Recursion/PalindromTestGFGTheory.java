//-----------------Wrong code--------------




import java.util.Scanner;

class PalindromTestGFGTheory {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        char str = sc.next().charAt(0);
        int s=sc.nextInt();
        int e=sc.nextInt();
        System.out.println(isPalindrome(str[], s, e));

    }
// s and e defines the start and end index of string

public static Boolean isPalindrome(char str[], int s, int e) 
{ 
    // If there is only one character 
    if (s == e) 
        return true; 
  
    // If first and last 
    // characters do not match 
    if (str[s] != str[e]) 
        return false; 
  
    // If there are more than  
    // two characters, check if  
    // middle substring is also  
    // palindrome or not
    if (s < e) 
        return isPalindrome(str, s + 1, e - 1); 
  
    return true; 
}     
}