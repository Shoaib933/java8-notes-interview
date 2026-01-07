package Instagram;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindCommonElements {
    static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> list2 = Arrays.asList(5,6,7,8,9,10);

        List<Integer> commomList = list1.stream()
                .filter(list2::contains)
                .toList();
        IO.println("Commomn elemets "+commomList);
        // Find uncommon elemets
        List<Integer> listUncommon = Stream.concat(list1.stream(), list2.stream())
                .filter(e -> !(list1.contains(e) && list2.contains(e)))
                .toList();
        IO.println("Uncommon app1 ..... "+listUncommon);


        //2nd Way

        Set<Integer> common = new HashSet<>(list1);
        common.retainAll(list2);
        //remove all elements those are not part of argumented collection means it gives common elemets
        IO.println("Retain : "+common);

        List<Integer> uncommon = Stream.concat(list1.stream(), list2.stream())
                .filter(e -> !common.contains(e))
                .collect(Collectors.toList());
        IO.println("Uncommon app1 ..... "+uncommon);


        //3rd way groupingBy
        List<Integer> uncommon1 = Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(uncommon1);






    }
}
