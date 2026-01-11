package interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
/*
Wipro : Alok
 */

public class PrintSingAndDupFromArray {
    static void main() {
        int[] a = {1,1,2,3,4,5,5,6,7,8,3};
//        printSeparateArrayStream(a);
        printSeparateArray(a);
    }
    static void printSeparateArray(int arr[]) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int n : arr) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        List<Integer> duplicates = new ArrayList<>();
        List<Integer> singles = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            } else {
                singles.add(entry.getKey());
            }
        }
        IO.println("Dup : "+duplicates);
        IO.println("Singles : "+singles);
    }
    static void printSeparateArrayStream(int[] arr) {

        HashMap<Integer, Long> freq = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new, // to preserved insertion order
                        Collectors.counting()
                ));

        int[] dup = freq.entrySet().stream()
                .filter( entry -> entry.getValue() > 1)
                .mapToInt(Map.Entry::getKey)
                .toArray();

        int[] single = freq.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .mapToInt(n -> n.getKey().intValue())
                .toArray();

        System.out.println("Duplicates: " + Arrays.toString(dup));
        System.out.println("Singles   : " + Arrays.toString(single));


    }
}
