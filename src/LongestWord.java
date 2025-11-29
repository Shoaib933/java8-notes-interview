import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestWord {
    static void findLongestWord() {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        String str = words.stream()
                .max(Comparator.comparingInt(String::length))
                .get();
        System.out.println("***** -: Longest Word :- *****");
        System.out.println(str);
    }
}
