package hue3;

import java.util.function.Predicate;

public class isPositiveAndOdd implements Predicate<Integer>{
    public boolean test(Integer x) {
        return x > 0;
    }
    public boolean negate(Integer x) {
        return x%2==0;
    }
}
