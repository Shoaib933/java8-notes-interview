package Instagram;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindSingleMissingNumFromArray {
    static void main() {
        int[] arr = {3,1,0,4,5};
        int n = arr.length;
        int expectedSum = n * (n+1)/2;
        int actualSum = Arrays.stream(arr).sum();
        int missNum = expectedSum-actualSum;
        IO.println("Missing Number : "+missNum);
    }
}
