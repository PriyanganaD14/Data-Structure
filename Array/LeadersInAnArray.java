//Time Complexity :O(n).
//Aux Space Complexity :O(n).

import java.util.ArrayList;
import java.lang.Math;
import java.util.Scanner;

class LeadersInAnArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int sizeOfArray=sc.nextInt();

        System.out.println("Enter the array :");
        int ar[]=new int[sizeOfArray];
        for(int i=0;i<sizeOfArray;i++){
            int x=sc.nextInt();
            ar[i]=x;
        } 
        
        System.out.print("Output :"+leaders(ar,sizeOfArray));
    
}

public static ArrayList<Integer>leaders(int arr[],int n){
    ArrayList<Integer>leaders=new ArrayList<Integer>();             //create an object of ArrayList


    int i;
    int res=arr[n-1];                                             //set the last right element as one of the leader of arraylist.
    leaders.add(res);                                             //add to the arraylist

    //travers from right to left
    for( i=n-2;i>=0;i--){
 
        if(res<=arr[i]){                                         //traverse from 2nd right most element
            res=arr[i];
            leaders.add(res);                                  //add one by one leader element to the arraylist
        }
    
    }

   // checkDecendingOrderSort(leaders,n);

    int s=leaders.size();                                   //get the size of the new arraylist



   reverse(leaders,0,s-1);                                 //call reverse function
    return leaders;

}

public static void checkDecendingOrderSort(ArrayList<Integer>a,int n){
   /*
    int max=0;
    for(int j=0;j<n;j++){
         max=Math.max(a.get(j), a.get(j+1));
    }
   
    return max;
   */

 /*
   if(n==1||n==0) {
      return -1;
  }
  */
/*
  if(a.get(n-1)>a.get(n-2)){
   return;
  }
  checkDecendingOrderSort(a, n-1);

  for(int j=0;j<n;j++){
      a.add(a.get(j));
  }
  */
  
}

public static void reverse(ArrayList<Integer> ar,int start,int end){

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

 

