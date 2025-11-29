import java.util.Arrays;
import java.util.List;

public class FinfFisrELem {
    static void findFirstElem() {
        List<Integer> numbers = Arrays.asList(5, 8, 12, 3, 20);

        int n = numbers.stream()
                .filter(a -> a>10)
                .findFirst()
                .orElse(-1);
        System.out.println("***** :-  first element in a Stream greater than 10. -: *****");
        System.out.println(n);
    }
}
