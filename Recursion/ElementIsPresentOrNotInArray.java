import java.util.Scanner;

class ElementIsPresentOrNotInArray {
       public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the array lenghth :");
          int arr[]=new int[sc.nextInt()];
          System.out.println("Enter the array : ");
          for(int i=0;i<=arr.length-1;i++){
              arr[i]=sc.nextInt();
          }
          System.out.println("Enter the First element");
          int f=sc.nextInt();
          System.out.println("Enter the Last element :");
          int l=sc.nextInt();
          System.out.println("Enter the searching element :");
          int x=sc.nextInt();
          System.out.println("Ans :");
          System.out.println(recursiveSearch(arr,f,l,x));
       }
        
       public static boolean recursiveSearch(int arr[],int f,int l,int x ){
           if(l<f){
               return false;
           }
           if(arr[f]==x){
               return true;
           }
           if(arr[l]==x){
               return true;
           }
           return recursiveSearch(arr, f+1, l-1, x);
       }
}