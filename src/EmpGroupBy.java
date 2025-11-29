import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpGroupBy {

    static void grpBydept() {
        List<Emp> employees = Arrays.asList(
                new Emp("Alice", "HR"),
                new Emp("Bob", "IT"),
                new Emp("Charlie", "HR"),
                new Emp("David", "IT")
        );
        Map<String, List<Emp>> groupedByDepartment = employees.stream().
                collect(Collectors.groupingBy(emp -> emp.dept));
        groupedByDepartment.forEach((dept, emp)-> {
                    System.out.println(dept+" : "+emp.stream().map(e -> e.name)
                            .collect(Collectors.toList()));
                });
    }
}
