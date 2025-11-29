import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapEx {

    static void testFlatMap() {
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("Alice", "Bob"),
                Arrays.asList("Charlie", "David")
        );
        List<String> flatList = nestedList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(flatList); // Output: [Alice, Bob, Charlie, David]
    }
 }
