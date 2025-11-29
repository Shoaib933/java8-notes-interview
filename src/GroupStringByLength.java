import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringByLength {

    static  void groupStrByLength() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        Map<Integer, List<String>> grp = names.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(grp);
    }
}
