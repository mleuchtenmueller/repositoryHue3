package hue3;

import java.util.function.Predicate;

public class isPositiveAndEven implements Predicate<Integer>{
    public boolean test(Integer x) {
        return x > 0;
    }
    public boolean and(Integer x) {
        return x%2==0;
    }
}
