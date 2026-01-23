package interview;
/*
Condition --- sorted array
Result --- remove some duplicates in-place such that each unique element appears at most twice.
 */
public class RemDupSortArrayLT80 {
    static void main() {
        int[] arr = {1,1,1,2,2,3};

        int newLiength = removeDup(arr);

        for (int i = 0; i < newLiength; i++) {
            IO.print( arr[i]+" ");
        }
    }

    static int removeDup(int[] arr) {
        if (arr.length<=2)
            return arr.length;
        int slow = 2;
        for (int fast = 2; fast < arr.length; fast++) {

            if (arr[slow-2] != arr[fast]) {
                arr[slow] = arr[fast];
                slow++;
            }
        }
        return slow;
    }
}
