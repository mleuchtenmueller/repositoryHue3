package hue3;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Beispiel2 {

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
