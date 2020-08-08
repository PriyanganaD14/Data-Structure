import java.util.Scanner;

public class EqulibriumPoint {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int sizeOfArray=sc.nextInt();

        System.out.println("Enter the array :");
        long ar[]=new long[sizeOfArray];
        for(int i=0;i<sizeOfArray;i++){
            int x=sc.nextInt();
            ar[i]=x;
        } 

        System.out.println("Output :  Equlibrium Index--");

        System.out.print(equlibriumPoint(ar,sizeOfArray));
}

public static int equlibriumPoint(long arr[],int n){

    int sum=0;                                            //initialize total sum is equal to zero

    for(int i=0;i<n;i++){

        sum+=arr[i];                                       //get total sum of the array
    }

    int l_sum=0;                                            //initialize left sum is equal to zero     

    for(int i=0;i<n;i++){                                      //travers loop for compare in every index to find equal point

        long r_s;

        r_s=sum-arr[i];                                       // sumation of right elements=sum of total element -current index                        

        if(r_s==l_sum){                                      //compare left sum side sum to right side sum

            return i+1;

        }

        l_sum+=arr[i];                                      //increase the left sum with add the current element

        sum-=arr[i];                                        //decrese the sum with substract the current element.
    }

    return -1;



}

}