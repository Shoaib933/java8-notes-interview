/*
Find Characters Which occurrences once in a string
 */

void main() {
    String str = "programming";

    Map<Character, Long> collect =  str.chars()
            .mapToObj(ch -> (char)ch)
            .collect(Collectors.groupingBy(
                    Function.identity(),
                    Collectors.counting()
            ));
    java.util.List<Character> characters = collect.entrySet()
            .stream()
            .filter(entry -> entry.getValue() == 1)
            .map(Map.Entry::getKey).toList();

    IO.println(characters);
}