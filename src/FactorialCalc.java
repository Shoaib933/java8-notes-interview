import java.util.stream.IntStream;

public class FactorialCalc {

    static void factCalc() {
        int number = 5;

        int fact = IntStream.rangeClosed(1, number)
                .reduce(1, (a, b )-> a*b);
        System.out.println("**** FACTORIAL *****");
        System.out.println(fact);
    }

}
