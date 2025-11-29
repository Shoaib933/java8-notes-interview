import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctElem {

    static void distinctElem() {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> dist = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("DISTINCT ELEMENTS : "+dist);
    }
}
