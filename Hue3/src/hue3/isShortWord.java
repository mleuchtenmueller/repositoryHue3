package hue3;

import java.util.function.Predicate;

public class isShortWord implements Predicate<String>{
    public boolean test(String x) {
        return x.length() < 4;
    }
}
