import java.util.Scanner;

class Deletion {
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

    System.out.println("Enter the delete element :");
    int element=sc.nextInt();

    delision(arr, sizeOfArray, element);

    System.out.println("Modified Array :");
    for(int i=0;i<sizeOfArray-1;i++){
        System.out.println(arr[i]+" ");
    }


  
}


    
    public static void delision(int ar[],int n,int ele){
        int index=-1;

        for(int i=0;i<n;i++){
            if(ar[i]==ele){
            index=i;
            break;
            }

        }
            if(index==-1){

                System.out.println("Not present");
  
            }
            for(int j=index;j<n-1;j++){
                ar[j]=ar[j+1];
            }
               
            }
        }
    

    

    



    