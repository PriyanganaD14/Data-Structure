import java.util.ArrayList;
import java.util.Scanner;

class ReverseArrayInGroup {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int sizeOfArray=sc.nextInt();

        System.out.println("Enter the Array List :");
        ArrayList<Integer>arr=new ArrayList<Integer>();          //create an arraylist as input
        for(int i=0;i<sizeOfArray;i++){
            int x=sc.nextInt();
            arr.add(x);
        }

        System.out.println("Enter the d : ");
        int d=sc.nextInt();

        reverseInGroups(arr,sizeOfArray,d);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println("Output :"+arr.get(i)+" ");
        }
    }

       public static ArrayList<Integer> reverseInGroups(ArrayList<Integer>mv,int n,int k){
        int i;
        int rem=mv.size() %k;   
        
        for(i=0;i<mv.size()-rem;i=i+k){
          reverse(mv,i,i+k-1);
        }
      
        if(rem!=0){
          reverse(mv,mv.size()-rem,mv.size()-1);
        }
          return mv;
      }

       public static void reverse(ArrayList<Integer>ar,int start,int end){
       int temp;
        while(end>start){
        temp=ar.get(start);
        ar.set(start,ar.get(end));
        ar.set(end,temp);
        start++;
        end--;

    }
}

}