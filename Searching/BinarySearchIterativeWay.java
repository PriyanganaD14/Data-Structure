import java.util.Scanner;

/**
 * BinarySearchIterativeWay
 */
public class BinarySearchIterativeWay {

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

        System.out.println("Finding element : ");
        int e = sc.nextInt();
        sc.close();

        System.out.println("Output : " + bSearch(arr, n, e));
    }

    public static int bSearch(int arr[], int n, int element) {

        int low = 0, high = n - 1; // represent indexes.

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == element) {
                return mid; // return index
            }

            else if (arr[mid] > element) {
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }

        }

        return -1;
    }
}