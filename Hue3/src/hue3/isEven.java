package hue3;

import java.util.function.Predicate;

public class isEven implements Predicate<Integer>{
    public boolean test(Integer x) {
        return x%2==0;
    }
}
