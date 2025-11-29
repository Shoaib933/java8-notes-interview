import java.util.*;
import java.util.stream.Collectors;

public class TeeingEx {

    static void teeingTest() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Map<String, Double> result = numbers.stream()
                .collect(Collectors.teeing(
                        Collectors.summingDouble(n -> n),
                        Collectors.averagingDouble(n -> n),
                        (sum, avg) -> Map.of("Sum", sum, "Average", avg)
                ));
        System.out.println(result); // Output: {Sum=15.0, Average=3.0}
    }
}
