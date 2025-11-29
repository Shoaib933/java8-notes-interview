import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmpSort {

    static void empSort() {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 5000),
                new Employee("Bob", 3000),
                new Employee("Charlie", 4000)
        );
        List<Employee> sorted = employees.stream()
                //.sorted(Comparator.comparingInt(e -> -e.salary)) // decreasing order
//                .sorted(Comparator.comparingInt(e -> e.salary))
//                .sorted((newEmp, oldEmp) -> {
//                    if(newEmp.salary > oldEmp.salary) return 1;
//                    else return -1;
//                })
                .sorted((newEmp, oldEmp) -> {
                    return (newEmp.salary > oldEmp.salary) ? 1 : ((newEmp.salary < oldEmp.salary) ? -1 : 0);
                })
                .collect(Collectors.toList());
        System.out.println(sorted); // Output: [Bob: 3000, Charlie: 4000, Alice: 5000]
        /*
        | Goal                          | Example                                                         |
| ----------------------------- | --------------------------------------------------------------- |
| Ascending order (low → high)  | `.sorted(Comparator.comparing(Employee::getSalary))`            |
| Descending order (high → low) | `.sorted(Comparator.comparing(Employee::getSalary).reversed())` |
| Manual lambda (ascending)     | `.sorted((e1, e2) -> Double.compare(e1.salary, e2.salary))`     |
| Manual lambda (descending)    | `.sorted((e1, e2) -> Double.compare(e2.salary, e1.salary))`

    .sorted(Comparator.comparingInt(Employee::getSalary))
    max(Integer::compare) |

         */
    }
}
