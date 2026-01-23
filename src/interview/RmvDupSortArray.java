package interview;
/*
Condition  - Array is sorted
  Result         - emove some duplicates in-place such that each unique element appears only once
 */
public class RmvDupSortArray {
    static void main() {
        int[] arr = {1,1,2,2,3,3,4,4};

        int newLiength = removeDup(arr);

        for (int i = 0; i < newLiength; i++) {
            IO.print( arr[i]+" ");
        }

    }

    static int removeDup(int[] arr) {
        if (arr.length == 0)
            return 0;
        int slow=0;

        for (int fast = 0; fast < arr.length; fast++) {

            if (arr[slow] != arr[fast]) {
                slow++;
                arr[slow] = arr[fast];
            }

        }
        return slow+1;
    }
}
