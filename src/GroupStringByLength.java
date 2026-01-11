import java.util.*;
import java.util.stream.Collectors;

public class GroupStringByLength {

    static  void groupStrByLength() {
        IO.println("Grouping By Length");
        List<String> names = Arrays.asList("Alice", "Three", "Shoaib","Bob",
                "Charlie", "Seven", "Six", "Eight");

        Map<Integer, List<String>> grp = names.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(grp);

        IO.println("Sorting In reverse order");

        List<Map.Entry<Integer, List<String>>> rev  = grp.entrySet().stream()
                .sorted(Map.Entry.<Integer, List<String>>comparingByKey().reversed())
                .toList();

        IO.println(rev);

//        ✅ If You Want Only the VALUES (List<String>)
                List<List<String>> revValList =
                grp.entrySet().stream()
                        .sorted(Map.Entry.<Integer, List<String>>comparingByKey().reversed())
                        .map(Map.Entry::getValue)
                        .collect(Collectors.toList());
        IO.println(revValList);
            // Very Confusion for me
//        ✅ If You Want a Sorted Map (Descending Key Order) ⭐ (Best)
                Map<Integer, List<String>> sortedMap =
                grp.entrySet().stream()
                        .sorted(Map.Entry.<Integer, List<String>>comparingByKey().reversed())
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (a, b) -> b,
                                LinkedHashMap::new
                        ));
        IO.println("If You Want a Sorted Map (Descending Key Order) ⭐ (Best)");
        IO.println(sortedMap);
    }
}
