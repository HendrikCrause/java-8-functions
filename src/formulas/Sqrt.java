package formulas;

public class Sqrt implements Formula {
    @Override
    public double calc(double x) {
        return Math.sqrt(x);
    }
}
