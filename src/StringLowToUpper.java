import java.util.Arrays;
import java.util.List;

public class StringLowToUpper {

    static void upperCase() {
        List<String> names = Arrays.asList("alice", "bob");

//        names.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
