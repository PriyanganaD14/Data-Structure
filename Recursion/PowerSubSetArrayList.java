import java.util.ArrayList;
import java.util.Scanner;

class PowerSubSetArrayList {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=sc.nextLine();
        powerSet2(str);
        
    }

    public static ArrayList<String> powerSet2(String s){
        ArrayList<String>subset=new ArrayList<String>();
        int index=0;
        String current=" ";
        powerSet(s, index, current,subset);
        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
       // subset.remove(0);
      // subset.remove(new String("")); 
        return subset;
        

    }

    public static void powerSet(String s,int index,String current,ArrayList<String>subset){
       int n=s.length();
       
       if(index==n){
          // System.out.print(current);
          if(current!=" "){
            subset.add(current);
          }
          
    
          return;
       }
      
      // subset.remove(0);
       powerSet(s, index+1, current,subset);
       powerSet(s, index+1, current+s.charAt(index),subset);

    }
    
}