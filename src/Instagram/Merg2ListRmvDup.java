package Instagram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
Merge two lista & remove duplicates.
 */
public class Merg2ListRmvDup {
    static void main() {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> list2 = Arrays.asList(5,6,7,8,9,10);

        List<Integer> list = Stream.concat(list1.stream(),
                list2.stream()).distinct()
                .toList();
        IO.println("Merge & removed dups : "+list);
    }
}
