//Time Complexity : O(log n)
//Space complexity : O(long n) for using recursion.

import java.util.Scanner;

public class IndexOfFirstOccuranceRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the array : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr[i] = x;
        }

        System.out.println("Enter the input element : ");
        int x = sc.nextInt();

        sc.close();

        System.out.println("Output index : " + firstOcc(arr, 0, n - 1, x));
    }

    public static int firstOcc(int arr[], int low, int high, int x) {

        // base case
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (arr[mid] > x) {
            return firstOcc(arr, low, mid - 1, x);
        }

        else if (arr[mid] < x) {
            return firstOcc(arr, mid + 1, high, x);
        }

        else {

            // check corner case and if the element is not corner element check with previous number
            if (mid == 0 || arr[mid] != arr[mid - 1]) {
                return mid;
            }

            // if previous number is same change high value and shift to left array.
            else {
                return firstOcc(arr, low, mid - 1, x);
            }
        }

    }

}
