import java.util.Arrays;
import java.util.Collections;

/**
 * DecreasingOrderSortedUsingWrapperClass
 */
public class DecreasingOrderSortedUsingWrapperClass {

    public static void main(String[] args) {

        //use Wrapper class of int.
        Integer arr[]={5,20,10,12};

        Arrays.sort(arr,Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));
    }
}