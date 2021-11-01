package hue3;

import java.util.function.Predicate;

public class isZero implements Predicate<Integer>{
    public boolean test(Integer x) {
        if(x == 0) return true;
        else return false;
    }
}
