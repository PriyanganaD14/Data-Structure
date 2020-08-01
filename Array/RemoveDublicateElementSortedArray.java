//Time Complexity :theta (n)
//Space Cpmplexity :theta (n)

import java.util.Scanner;

class RemoveDublicateElementSortedArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int sizeOfArray=sc.nextInt();

        System.out.println("Enter the array : ");
        int arr[]=new int[sizeOfArray];
        for(int i=0;i<sizeOfArray;i++){
            int x=sc.nextInt();
            arr[i]=x;
        }   

       System.out.println("Size of Array : "+ removeDublicacy(arr,sizeOfArray));


    }

    public static int removeDublicacy(int ar[],int n){

        int temp[]=new int[n] ;                 //create an temp array of size n
        temp[0]=ar[0];                          //store the value of 1st element of array ar[].
        int res=1;                              //because the array atleast return one elemnt,with out dublicacy.
        System.out.println("Array with out Dublicate Element :"+ar[0]);


        for(int i=1;i<n;i++){                   //loop start from 2nd index.                 //Time Complexity:theta (n)
            if(temp[res-1]!=ar[i]){             //1st element not equal to 2nd element
                temp[res]=ar[i];                //value insert into temp
                System.out.println("Array with out Duplicate Element : "+ar[i]+" ");
                res++;                          //res is increament for check the next index's element

            }
            
        }

        for(int i=0;i<res;i++){                                                                  //Time Complexity: big O(n)
            ar[i]=temp[i];                        //now temp contain without duplicate value

           // System.out.println("Array with out Duplicate Element : "+temp[i]+" ");
            return res;
        }

        return -1;


    }

    
}