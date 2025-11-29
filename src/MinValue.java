import java.util.Arrays;
import java.util.List;

public class MinValue {
    static void minVal() {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);

        int n = numbers.stream()
//                .min((x, y) -> (x < y) ? -1 : ((x.equals(y)) ? 0 : 1))
                .min((x, y) -> (x > y) ? 1 : ((x == y) ? 0 : -1))
                .get();

        System.out.println("Minimum: " + n);
    }
}
