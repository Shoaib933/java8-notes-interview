import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class MaxValue {
    static void maxVal() {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
//        int n = numbers.stream().max(Integer::compare).orElse(0);
        int n = numbers.stream().max(Integer::compare).get();
        /*
        IO.println("Max Numebr IMPL : "+
                numbers.stream().max(Comparator.comparingInt(a -> {
                    IO.println("Hi : "+a *2);
                    return a * 2;

                })).get());

         */
        System.out.println("Maxx :" +n);
    }
}