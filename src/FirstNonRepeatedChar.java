public class FirstNonRepeatedChar {

    static void firstNonRepeatChar() {
        String input = "swiss";
        Character result = input.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch))
                .findFirst()
                .orElse(null);
        System.out.println(result); // Output: w

        Character char1 = input.chars()
                .mapToObj( ch -> (char) ch)
                .filter(character -> input.indexOf(character) == input.lastIndexOf(character))
                .findFirst()
                .orElse(null);

        System.out.println(char1); // Output: w

    }
}
