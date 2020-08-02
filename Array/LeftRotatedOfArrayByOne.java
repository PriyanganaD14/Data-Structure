import java.util.Scanner;

class LeftRotatedOfArrayByOne {
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
        
        rotate(arr,sizeOfArray);
}

    public static void rotate(int ar[],int n){

        int temp=ar[0];
         for(int i=1;i<n;i++){                           //rotation starts from index 1 

            ar[i-1]=ar[i];                               //to avoid array out of bound we use this,instead of ar[i]=ar[i+1]
            
            System.out.println("Rotated Array : "+ar[i]+" ");
        
       }

       ar[n-1]=temp;
       System.out.println("Rotated Array : "+ar[n-1]+" ");



    
}


}