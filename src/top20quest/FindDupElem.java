package top20quest;

import java.util.HashSet;
import java.util.List;

/*
Find Duplicate lements
 */

public class FindDupElem {

    static void main() {
        List<Integer> list = List.of(1, 2, 2, 3, 4, 4, 5);
        HashSet<Integer> hs = new HashSet<>();

        List<Integer> dup = list.stream()
                .filter(n -> !hs.add(n))
                .toList();
        IO.println("Dup Elements : "+
                dup);
    }
}
