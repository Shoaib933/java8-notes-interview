import java.util.Arrays;
import java.util.List;

public class CheckElem {

    static void greaterThan5() {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
        boolean allGreater = numbers.stream()
                .allMatch(n -> n>5);
        System.out.println("All List Elements Greatre Than 5 : "+allGreater);
    }

}
