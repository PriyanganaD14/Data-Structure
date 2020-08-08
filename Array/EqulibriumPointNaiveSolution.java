//Time Complexity : O(n2)



import java.util.Scanner;

class EqulibriumPointNaiveSolution {
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

        System.out.println("Output :  Equlibrium --");

       System.out.println(equlibrium(ar,sizeOfArray));
}

public static boolean equlibrium(int arr[],int n){

    for(int i=0;i<n;i++){                                  //loop travers to the whole array

        int l_sum=0,r_sum=0;                               //initialize
           
        for(int l=0;l<i;l++){                                //loop travers only the left element

            l_sum+=arr[l];
        }

        for(int r=i+1;r<n;r++){                                   //loop travers only the right element

            r_sum+=arr[r];
        }

        if(l_sum==r_sum){                                       //compare

            return true;
        }

        return false;
    }
    return false;
}
}