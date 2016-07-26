package lambdaexample;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SorterNoOutput {

    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(4, 7, 2, 9, 5, 2, 7, 8, 0, 1);
        Collections.sort(numbers1);

        List<Integer> numbers2 = Arrays.asList(4, 7, 2, 9, 5, 2, 7, 8, 0, 1);
        Collections.sort(numbers2, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        List<Integer> numbers3 = Arrays.asList(4, 7, 2, 9, 5, 2, 7, 8, 0, 1);
        Collections.sort(numbers3, (o1, o2) -> {
            int result = o2 - o1;
            return result;
        });

        List<Integer> numbers4 = Arrays.asList(4, 7, 2, 9, 5, 2, 7, 8, 0, 1);
        Collections.sort(numbers4, (o1, o2) -> o2 - o1);
    }
}
