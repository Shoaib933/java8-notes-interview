import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {

    static void firstNonRepeatChar() {
        String input = "swiss";
        Character result = input.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch))
//                .filter(ch -> input.indexOf(ch) != input.lastIndexOf(ch)) // first repeated character
                .findFirst()
                .orElse(null);
        System.out.println(result); // Output: w

        Character char1 = input.chars()
                .mapToObj( ch -> (char) ch)
                .filter(character -> input.indexOf(character) == input.lastIndexOf(character))
                .findFirst()
                .orElse(null);

        System.out.println(char1); // Output: w

        IO.println("By Using Fubction.idetity()");

        LinkedHashMap<Character, Long> linkedHashMap =
                input.chars().mapToObj(ch-> (char)ch)
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                LinkedHashMap::new,
                                Collectors.counting()
                        ));
        IO.println(
                linkedHashMap.entrySet().stream()
                        .filter(key -> key.getValue() == 1)
                        .findFirst().get().getKey()
        );


        /*
        //first repeated char
        HashMap<Character, Long> hashMap = input.chars()
            .mapToObj(c -> (char)c)
            .collect(Collectors.groupingBy(
                    Function.identity(),
                    LinkedHashMap::new,
                    Collectors.counting()
                    ));
    IO.println(hashMap.entrySet().stream()
            .filter(el-> el.getValue() > 1)
                    .map(Map.Entry::getKey)
            .findFirst()
            .get());
         */



    }
}
