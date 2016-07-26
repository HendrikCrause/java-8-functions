package formulas;

/**
 *  The @FunctionalInterface annotation may be used on classes with more than one input parameter
 */
@FunctionalInterface
public interface TwoInputFormula {

    double calc(double x, double y);
}
