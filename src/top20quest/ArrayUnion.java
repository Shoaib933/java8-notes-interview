package top20quest;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayUnion {
    static void main() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {4, 5, 6, 7, 8};

        String[] s1 = {"A", "B", "C"};
        String[] s2= {"B", "C", "D"};
        /*
        //first approach


        int[] union = Arrays.stream(new int[][]{a, b}).flatMapToInt(Arrays::stream)
                .distinct().toArray();
        IO.println("Union in Primitive "+Arrays.toString(union));

         */
        //By concating
        int[] union = IntStream.concat(Arrays.stream(a), Arrays.stream(b))
                .distinct()
                .toArray();
        IO.println("Unionj concat : "+Arrays.toString(union));

        String[] res= Stream.concat(Arrays.stream(s1), Arrays.stream(s2))
                .distinct().toArray(String[]::new);
        IO.println("Unin obj : "+Arrays.toString(res));

    }
}
