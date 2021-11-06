package hue3;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Moritz Leuchtenmüller
 */
public class Main{

    public static void main(String[] args) throws IOException {
        Reader reader = new Reader();
        List<Weapon> weapons = reader.read();
        Printable printable = new Printable() {
            @Override
            public void print(List<Weapon> weapons) {
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
                weapons.forEach((Weapon weapon) -> System.out.println(String.format("|%20s|", weapon.getName()) + String.format("%20s|", weapon.getCombatType().toString()) + String.format("%20s|", weapon.getDamageType().toString()) + String.format("%20d|", weapon.getDamage()) + String.format("%20d|", weapon.getSpeed()) + String.format("%20d|", weapon.getStrength()) + String.format("%20d|", weapon.getValue())));
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
            }
        };
        printable.print(weapons);
        //Test Mapper
        final List <String> names = Arrays.asList("Tim" , "Andi " , "Michael " ) ;
        final Mapper<String, Integer> intMapper = String::length;
        System.out.println(intMapper.mapAll(names));
        final Mapper<String, String> stringMapper = (s) -> {String t = s;
        return t;};
        final List<String> uppercaseNames = stringMapper.mapAll(names) ;
        System.out.println(uppercaseNames);
    }
}
