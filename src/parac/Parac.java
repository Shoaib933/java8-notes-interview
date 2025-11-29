package parac;

import java.util.*;
import java.util.function.LongUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Parac {
    public static void parac() {
        List<Emp> employees = Arrays.asList(
                new Emp("Alice", "HR"),
                new Emp("Bob", "IT"),
                new Emp("Charlie", "HR"),
                new Emp("David", "IT")
        );

        Map<String, List<Emp>> map = employees.stream()
                .collect(Collectors.groupingBy(Emp::getDept));

        map.forEach((dept, emp) -> {
            System.out.println(dept+ " : "
            +emp.stream().map(e -> e.name).collect(Collectors.toUnmodifiableList()));
        });
//        LongUnaryOperator
    }
}
