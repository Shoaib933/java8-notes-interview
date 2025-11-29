import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlattenList {

    static void flattenList() {

        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9, 10, 11, 12)
        );
//        List<Integer> list = nestedList.stream().flatMap(List::stream).toList();
//        System.out.println("Flatten List: "+list);
        List<Integer> list = nestedList.stream().flatMap(Collection::stream).toList();
        System.out.println("Flatten List: "+list);

    }
}
