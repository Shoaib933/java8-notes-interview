import java.util.Arrays;
import java.util.List;

public class ExtractSubList {

    static void subList() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        List<Integer> subList = numbers.stream()
                .skip(2)
                .limit(3)
                .toList();

        System.out.println("*****   SUBLIST   *****");
        System.out.println(subList);
    }
}
