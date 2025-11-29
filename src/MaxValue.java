import java.util.Arrays;
import java.util.List;

public class MaxValue {
    static void maxVal() {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
//        int n = numbers.stream().max(Integer::compare).orElse(0);
        int n = numbers.stream().max(Integer::compare).get();
        System.out.println("Maxx :" +n);
    }
}