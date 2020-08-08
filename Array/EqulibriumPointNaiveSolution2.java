//Time Complexity : O(n)
//Aux Space complexity : O(1)


import java.util.Scanner;

public class EqulibriumPointNaiveSolution2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int sizeOfArray = sc.nextInt();

        System.out.println("Enter the array :");
        int ar[] = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            int x = sc.nextInt();
            ar[i] = x;
        }

        System.out.println("Output :  Equlibrium --");

        System.out.println(equalPoint(ar, sizeOfArray));
    }

    public static boolean equalPoint(int arr[], int n) {

        int sum = 0;                      //initialize sum is equal to zero

        for (int i = 0; i < n; i++) {

            sum += arr[i];               // sumation of every element of the array with previous elements
        }

        int l_sum = 0;                        //initialize left sum is equal to zero                              

        for (int i = 0; i < n; i++) {                    //travers loop for compare in every index to find equal point

            int l_s = sum - arr[i];                        // sumation of left elements=sum of total element -current index

            if (l_sum == l_s) {                           //compare left sum side sum to right side sum

                return true;
            }

            l_sum += arr[i];                                 //if not equal add the element with left sum,left sum increses

            sum -= arr[i];                                   //if not equal substract the element from sum,sum decreases
        }

        return false;
    }

}