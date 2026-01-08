import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurrenceWord {

    static void countOccurWord() {
        String sentence = "Java is fun and Java is powerful";
        Map<String, Long> map = Arrays.stream(sentence.split(" "))
//                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("***** :- Word Occurrences :- *****");
        System.out.println(map);
    }
}
