import java.util.Arrays;
import java.util.List;

public class NumbersSum {

    static void sum() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
       int sum = numbers.stream()
               .reduce(0, (a, b) -> a+b);

//        int sum = numbers.stream()
//                .reduce(0, Integer::sum);

        System.out.println("Sum : "+sum);
    }
}
