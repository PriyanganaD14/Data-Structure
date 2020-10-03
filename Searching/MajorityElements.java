import java.util.Scanner;

//Majority Elements are that element which have occure more than n/2 times in the whole array ,where n is the length of the whole array.

//Time Complexity : O(n)
// Space Complexity : O(1)

/**
 * MajorityElements
 */
public class MajorityElements {

    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);

        System.out.println("Enter the length of the array : ");
        int n=sc.nextInt();

        System.out.println("Enter the array : ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            arr[i]=x;
        }

        System.out.println("Majority Element : "+getResult(arr,n));

        sc.close();
    }

    public static int getResult(int arr[],int n){

        // Step 1 : Find the element which can be the majority element.  (if atleast any two element is occure respectavely then it may be a majority element)

        int count=1,res=0; //1st we consider that 1st element is the majority element.

        // So travers from 2nd element

        for(int i=1;i<n;i++){

            if(arr[res]==arr[i]){
                count++;
            }
            else{
                count--;
            }

            if(count==0){
                res=i;  // becoz res compare with arr[i].
                count=1;

            }

        }

        //Step 2 : Find the element is mejority or not.
        count=0;
        int i;
        for(i=0;i<n;i++){
            if(arr[i]==arr[res]){       //if count remains one(it means atleast one element occures consecutively) then res does not update by i and we find the index of majority element.
                count++;

            }

            if(count>(n/2)){
                res=arr[res];
                return res;
            }
        }

        return -1;

    }
}