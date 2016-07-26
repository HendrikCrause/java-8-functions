package formulas;

/**
 *  An interface with the @FunctionalInterface annotation may only have a single abstract method
 */
@FunctionalInterface
public interface Formula {
    double calc(double x);
}
