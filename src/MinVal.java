import java.util.Arrays;
import java.util.List;

public class MinVal {
    static void minVal() {
        List<Integer> numbers = Arrays.asList(10, 20, 5, 15);
        int min = numbers.stream()
                .min(Integer::compareTo)
                .orElseThrow(()-> new RuntimeException("No min value found"));
        System.out.println("***** Min Value *****");
        System.out.println(min);
    }
}
