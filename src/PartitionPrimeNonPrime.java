import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PartitionPrimeNonPrime {

    static void primeList() {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> map = numbers.stream()
                .collect(Collectors.partitioningBy(n -> isPrime(n)));
        System.out.println("***** PARTITION PRIME NON PRIME *****");
        System.out.println(map);
    }

    static boolean isPrime(int num) {
        if (num <= 1) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(num)).noneMatch(n ->
                num % n == 0);
    }
}
