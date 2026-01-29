package interview;

public class removeSpecElemArray {

    static void main() {

        int[] arr = {3, 2, 2, 3};
//        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};
        int rmvElem = 2;
        int p=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != rmvElem) {
                arr[p] = arr[i];
                p++;
            }
        }

        for (int i = 0; i < p; i++) {
            IO.println(arr[p]);
        }
        IO.println("length : "+p);

    }
}
