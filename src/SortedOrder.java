import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedOrder {

    static void alphaSorted() {
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");

        List<String> ascSortedOrder = names.stream()
                .sorted().toList();
        System.out.println("Ascending : "+ascSortedOrder);

        List<String> descSortedOrder = names.stream()
                .sorted(Comparator.reverseOrder()).toList();
//                .sorted(Collections.reverseOrder()).toList();
        System.out.println("Descending : "+descSortedOrder);

        List<String> descSortedOrderAnother = names.stream()
                .sorted((a, b) -> {
//                    return -a.compareTo(b);
                    return b.compareTo(a);
                }).toList();

        System.out.println("Descending Anothetr: "+descSortedOrderAnother);
    }
}
