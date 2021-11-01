package hue3;

import java.util.function.Predicate;

public class isNull implements Predicate<Integer>{
    public boolean test(Integer x) {
        return x == null;
    }
}
