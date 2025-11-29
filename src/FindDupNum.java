import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDupNum {

    static void findDupNum() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 2, 3);

        Set<Integer> dupList = numbers.stream()
                .filter(n -> Collections.frequency(numbers, n) > 1)
                .collect(Collectors.toSet());
        //We can also find list of unique numbers by using Collections.frequency(numbers, n) == 1
        System.out.println("Duplicates Elements ::");
        System.out.println(dupList);

    }
}
