import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFrequency {

    static void countFrequency() {
        String input = "java";
        Map<Character, Long> freq = input.chars()
                .mapToObj(ch -> (char)ch)
//                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Frequency : "+freq);
    }
}
