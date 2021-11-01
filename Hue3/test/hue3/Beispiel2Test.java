package hue3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Beispiel2Test {

    public Beispiel2Test() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testAverage() {
        int[] numbers = {3, 3, 5, 4, 0};
        Beispiel2 instance = new Beispiel2();
        assertEquals(3, instance.average(numbers));
    }

    @Test
    public void testUpperCase() {
        String[] strings = {"hElLo", "WOrld"};
        Beispiel2 instance = new Beispiel2();
        List<String> expected = Arrays.asList("HELLO", "WORLD");
        assertEquals(expected, instance.upperCase(strings));
    }
}
