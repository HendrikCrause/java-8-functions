package formulas;

public class Lambdas {

    public static void main(String[] args) {
        Formula add1 = x -> x + 1;
        System.out.println(add1.calc(1));

        TwoInputFormula mult = (x, y) -> x * y;
        System.out.println(mult.calc(2, 3));
    }
}
