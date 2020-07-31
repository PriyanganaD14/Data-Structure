import java.util.ArrayList;
import java.util.Scanner;

class MaxAndSecondMax {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int sizeOfArray=sc.nextInt();

        System.out.println("Enter the array :");
        int arr[]=new int[sizeOfArray];
        for(int i=0;i<sizeOfArray;i++){
            int x=sc.nextInt();
            arr[i]=x;
        }   

       System.out.println("Second Largest Element :"+maxAndSecondMax(sizeOfArray,arr));

    }

    public static Integer maxAndSecondMax(int n,int ar[]){                      
     // ArrayList<Integer>maxAndSecondMax=new ArrayList<Integer>();             //creat an array list to increase and decrease the the size of the array.
        int max=Integer.MIN_VALUE;                                       //set max value to integer min value=-2147483648
        int secondMax=Integer.MIN_VALUE;

        //Travers the array

        for(int i=0;i<n;i++){
            if(ar[i]>max){

                secondMax=max;
                max=ar[i];
            }


            else if(ar[i]>secondMax && ar[i]!=max){
                secondMax=ar[i];
            }

        }

        System.out.println("Largest Element :"+max);

       if(secondMax==Integer.MIN_VALUE){
            return -1;
        }
        else{
            return secondMax;
        }
    

        
    }


}