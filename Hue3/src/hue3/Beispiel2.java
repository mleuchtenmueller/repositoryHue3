package hue3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.BaseStream;
import java.util.stream.Collector;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Beispiel2 {

    Stream stream = new Stream() {
        @Override
        public Stream filter(Predicate predicate) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Stream map(Function mapper) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public IntStream mapToInt(ToIntFunction mapper) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public LongStream mapToLong(ToLongFunction mapper) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public DoubleStream mapToDouble(ToDoubleFunction mapper) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Stream flatMap(Function mapper) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public IntStream flatMapToInt(Function mapper) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public LongStream flatMapToLong(Function mapper) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public DoubleStream flatMapToDouble(Function mapper) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Stream distinct() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Stream sorted() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Stream sorted(Comparator comparator) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Stream peek(Consumer action) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Stream limit(long maxSize) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Stream skip(long n) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void forEach(Consumer action) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void forEachOrdered(Consumer action) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Object[] toArray() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Object[] toArray(IntFunction generator) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Object reduce(Object identity, BinaryOperator accumulator) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Optional reduce(BinaryOperator accumulator) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Object reduce(Object identity, BiFunction accumulator, BinaryOperator combiner) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Object collect(Supplier supplier, BiConsumer accumulator, BiConsumer combiner) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Object collect(Collector collector) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Optional min(Comparator comparator) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Optional max(Comparator comparator) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public long count() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public boolean anyMatch(Predicate predicate) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public boolean allMatch(Predicate predicate) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public boolean noneMatch(Predicate predicate) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Optional findFirst() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Optional findAny() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Iterator iterator() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Spliterator spliterator() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public boolean isParallel() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public BaseStream sequential() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public BaseStream parallel() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public BaseStream unordered() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public BaseStream onClose(Runnable closeHandler) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void close() {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    };
    int[] array = new Random().ints(10000, 0, 100).toArray();

    public double average(int[] numbers) {
        return Arrays.stream(array).average().orElse(Double.NaN);
    }

    public void generateRandomStrings() {
        String[] randomStrings = new String[10];
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();
        char[] text = new char[10];
        for (int i = 0; i < randomStrings.length; i++) {
            for (int j = 0; j < text.length; j++) {
                text[j] = characters.charAt(rand.nextInt(characters.length() - 1));
            }
            randomStrings[i] = text.toString();
        }
    }

    List<String> upperCase(String[] strings) {
        return (List<String>) Arrays.asList(strings).stream().map(n -> n.toUpperCase());
    }
}
