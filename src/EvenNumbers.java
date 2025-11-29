import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {

    public static void evenNum() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.stream().filter(n -> n %2== 0).collect(Collectors.toList()).forEach(System.out::println);
    }
}
