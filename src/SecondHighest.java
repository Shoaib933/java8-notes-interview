import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighest {

    static void secondHighest() {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        int secondHighest = numbers.stream().sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow(()-> new RuntimeException("No Second Highest Found"));
        System.out.println("Second Highest ; "+secondHighest);
    }
}
