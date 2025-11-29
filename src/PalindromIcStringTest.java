import java.util.Arrays;
import java.util.List;

public class PalindromIcStringTest {

    static void palid() {
        List<String> words = Arrays.asList("madam", "racecar", "java", "level",
                "hello");

        List<String> list = words.stream()
                .filter(w -> w.equals(new StringBuilder(w).reverse().toString()))
                .toList()

                ;

        System.out.println("Palindromic String");
        System.out.println(list);
    }
}
