import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListConcatenation {

    static  void listConcat() {
        List<String> words = Arrays.asList("Java", "is", "awesome");
        String str = words.stream().collect(Collectors.joining(" "));
        System.out.println(str);
    }
}
