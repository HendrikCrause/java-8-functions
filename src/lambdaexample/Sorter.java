package lambdaexample;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Sorter {

    public static void main(String[] args) {
        System.out.println("Natural order sort");
        List<Integer> numbers1 = Arrays.asList(4, 7, 2, 9, 5, 2, 7, 8, 0, 1);
        System.out.println("Original list: " + numbers1.toString());
        Collections.sort(numbers1);
        System.out.println("Sorted list: " + numbers1.toString());
        System.out.println();

        System.out.println("Reverse order sort");
        List<Integer> numbers2 = Arrays.asList(4, 7, 2, 9, 5, 2, 7, 8, 0, 1);
        System.out.println("Original list: " + numbers2.toString());
        Collections.sort(numbers2, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println("Sorted list: " + numbers2.toString());
        System.out.println();

        System.out.println("Reverse order sort -  Multiline lambda function");
        List<Integer> numbers3 = Arrays.asList(4, 7, 2, 9, 5, 2, 7, 8, 0, 1);
        System.out.println("Original list: " + numbers3.toString());
        Collections.sort(numbers3, (o1, o2) -> {
            int result = o2 - o1;
            return result;
        });
        System.out.println("Sorted list: " + numbers3.toString());
        System.out.println();

        System.out.println("Reverse order sort -  Single line / Expression lambda");
        List<Integer> numbers4 = Arrays.asList(4, 7, 2, 9, 5, 2, 7, 8, 0, 1);
        System.out.println("Original list: " + numbers4.toString());
        Collections.sort(numbers4, (o1, o2) -> o2 - o1);
        System.out.println("Sorted list: " + numbers4.toString());
        System.out.println();
    }
}
