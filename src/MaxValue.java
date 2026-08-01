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
        /*

        Step 2: .max(Integer::compare)

The method signature is:

Optional<T> max(Comparator<? super T> comparator)

For Stream<Integer> it becomes:

Optional<Integer> max(Comparator<Integer> comparator)

The max() method needs to know how to compare two Integer objects.

You provide:

Integer::compare

which is a method reference to

Integer.compare(int x, int y)

Internally it is equivalent to:

(a, b) -> Integer.compare(a, b)

or

new Comparator<Integer>() {
    @Override
    public int compare(Integer a, Integer b) {
        return Integer.compare(a, b);
    }
}

         */
    }
}