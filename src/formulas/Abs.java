package formulas;

public class Abs implements Formula {
    @Override
    public double calc(double x) {
        return Math.abs(x);
    }
}
