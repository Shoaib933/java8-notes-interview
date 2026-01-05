package Instagram;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindMissingNumberListFromArray {
    static void main() {
        int[] arr = {1,2,1,2,5,8};
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();

        Set<Integer> collect = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toSet());

        List<Integer> list = IntStream.rangeClosed(min, max)
                .boxed()
                .filter(x -> !collect.contains(x))
                .toList();
        IO.println("Missing Elements Are : "+list);
    }
}
