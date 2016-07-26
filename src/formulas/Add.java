package formulas;

public class Add implements TwoInputFormula {
    @Override
    public double calc(double x, double y) {
        return x + y;
    }
}
