package Instagram;

import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

/*
Find Smallest Word In String
 */
public class SmallWordInString {

    static void main() {
        String str = "Good Morning";
//        Stream.of(str.split(" "));
        String s = Arrays.stream(str.split(" "))
                .min(Comparator.comparingInt(String::length)).orElse(null);
        IO.println(s);
    }
}
