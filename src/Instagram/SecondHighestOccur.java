/*
Find 2nd Highest occurrences of Word
 */
void main() {
    String str = "Hello Hello World World Hello Hello India India World World World India";

    Map<String, Long> collect = Stream.of(str.split(" "))
            .collect(Collectors.groupingBy(
                    Function.identity(), Collectors.counting()
            ));

    Map.Entry<String, Long> secondHighest = collect.entrySet()
            .stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
            .skip(1)
            .findFirst().get();

    IO.println(secondHighest);


}