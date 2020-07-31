import java.util.Scanner;

class ArrayIsSortedOrNotNaiveMethod {
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

        System.out.println("The array is sorted ?");
        System.out.println(isSorted(arr));
    }

    public static boolean isSorted(int ar[]){

        for(int i=0;i<ar.length;i++){
  
            for(int j=i+1;j<ar.length;j++){

                if(ar[j]<ar[i]){
                    return false;
                }
            }
        }

        return true;
    }


    
}