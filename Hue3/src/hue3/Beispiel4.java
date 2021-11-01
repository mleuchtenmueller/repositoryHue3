package hue3;

import java.util.stream.DoubleStream;

public class Beispiel4 {
    public int squareOddNumbersAndCalcSum(){
        final int result = DoubleStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(x -> x%2 != 0).map(x -> Math.pow(x, 2)).reduce(0, Integer::sum);
        return result;
    }
}
