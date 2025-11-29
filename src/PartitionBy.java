import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionBy {

    static void partitionByElem() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

       Map<Boolean, List<Integer>> map = numbers.stream().collect(Collectors.partitioningBy(n -> n%2==0));
        System.out.println(map);
    }
}
