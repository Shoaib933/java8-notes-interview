import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GenRandNum {
    static void genRandNum() {
        List<Double> list = Stream.generate(Math::random)
                .limit(5)
                .collect(Collectors.toUnmodifiableList());
        System.out.println("**** ---Generate Random Number--- *****");
        System.out.println(list);
    }
}
