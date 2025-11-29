import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeList {
    static void mergeList() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        List list = Stream.of(list1, list2)
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println("***** -: Merged List :- ******");
        System.out.println(list);
    }
}
