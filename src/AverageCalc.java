import java.util.Arrays;
import java.util.List;

public class AverageCalc {

    static void avgCalc() {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
        double avg = numbers.stream()
                .mapToInt(Integer::intValue)
                .average().orElse(0.0);

        System.out.println("Avg Number : "+avg);
        /*
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);

double average = numbers.stream()
        .collect(Collectors.averagingInt(Integer::intValue));

System.out.println(average); // 25.0

         */
    }
}
