package hue3;

import java.util.stream.IntStream;

public class Beispiel4 {
    public int squareOddNumbersAndCalcSum(){
        final int result = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(x -> x%2 != 0).map(x -> (int)x*x).reduce(0, Integer::sum);
        return result;
    }
}
