import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWith {

    static void startsWithA() {
        List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Alex");

        List<String> filteredNames = names.stream().filter(str -> str.startsWith("A"))
                .collect(Collectors.toUnmodifiableList());

        System.out.println("Starts With A : "+filteredNames);
    }
}
