package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsDemo {

    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(4, 7, 2, 9, 5, 2, 7, 8, 0, 1);

        // Terminal operations
        System.out.print("Original list: [");
        numbers1.stream()
                .forEach(n -> System.out.print(n + ", "));
        System.out.println("]");

        Set<Integer> set = numbers1.stream()
                .collect(Collectors.toSet());
        System.out.println("Set: " + set.toString());

        boolean contains2 = numbers1.stream()
                .anyMatch(n -> n == 2);
        System.out.println("Contains 2: " + contains2);

        long count = numbers1.stream()
                .count();
        System.out.println("Count: " + count);

        // Intermediate operations
        System.out.print("Filter < 5: [");
        numbers1.stream()
                .filter(n -> n < 5)
                .forEach(n -> System.out.print(n + ", "));
        System.out.println("]");

        System.out.print("Sorted: [");
        numbers1.stream()
                .sorted()
                .forEach(n -> System.out.print(n + ", "));
        System.out.println("]");

        System.out.print("Bytes: [");
        numbers1.stream()
                .map(Integer::byteValue)
                .forEach(n -> System.out.print(n + ", "));
        System.out.println("]");
    }
}
