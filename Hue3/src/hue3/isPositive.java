package hue3;

import java.util.function.Predicate;

public class isPositive implements Predicate<Integer>{
    public boolean test(Integer x) {
        return x > 0;
    }
}
