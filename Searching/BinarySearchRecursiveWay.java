import java.util.Scanner;

public class BinarySearchRecursiveWay {
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

        System.out.println("Findind element : ");
        int e = sc.nextInt();
        sc.close();

        System.out.println("Output : " + bSearch(arr, 0, n - 1, e));

    }

    public static int bSearch(int arr[], int low, int high, int x) {

        if (low > high) { // base case

            return -1;

        }

        int mid = (low + high) / 2;

        if (arr[mid] == x) {
            return mid;
        }

        else if (arr[mid] > x) {
            return bSearch(arr, low, mid - 1, x);
        } else {
            return bSearch(arr, mid + 1, high, x);
        }
    }

}
