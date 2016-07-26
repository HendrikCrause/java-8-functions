package formulas;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;

public class References {

    public static void main(String[] args) {
        // Static method reference
        Formula exp = Math::exp;

        // Instance method reference
        Integer in = 2;
        IntFunction<Integer> compareToIn = in::compareTo;

        // Constructor reference
        IntConsumer makeInt = Integer::new;
    }
}
