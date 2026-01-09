package top20quest;

import java.util.List;

public class CheckAllNumEven {
    static void main() {
        List<Integer> list = List.of(1, 2, 2, 3, 4, 4, 5);
        IO.println("check if all numbers are even ");
        IO.println(
                list.stream().allMatch(n-> n%2 ==0)
        );
        IO.println("check if any numbers are even ");
        IO.println(
                list.stream().anyMatch(n -> n%2 ==0)
        );

    }
}
