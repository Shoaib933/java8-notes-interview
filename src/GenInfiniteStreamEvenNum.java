import java.util.List;
import java.util.stream.Stream;

public class GenInfiniteStreamEvenNum {

    static void genInfStream() {
        List list = Stream.iterate(0,  n -> n+2)
                .limit(10)
                .toList();
        System.out.println("Infinite Sgtream Of Even Number: "+list);
    }
}
