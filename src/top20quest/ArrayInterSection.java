package top20quest;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayInterSection {
    static void main() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {4, 5, 6, 7, 8};
        Set<Integer> setB = Arrays.stream(b)
                .boxed()
                .collect(Collectors.toSet());

        int[] intersection = Arrays.stream(a)
                .filter(setB::contains)
                .toArray();

        System.out.println(Arrays.toString(intersection));
    }
}
