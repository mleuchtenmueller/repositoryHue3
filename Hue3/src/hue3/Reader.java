package hue3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Moritz Leuchtenmüller
 */
public class Reader {

    public List<Weapon> read() throws IOException {
        List<Weapon> weapons = new LinkedList<>();
        weapons = Files.lines(new File("weapons.csv").toPath())
                .skip(1)
                .map(s -> s.split(";"))
                .map(s -> new Weapon(
                s[0],
                CombatType.valueOf(s[1]),
                DamageType.valueOf(s[2]),
                Integer.parseInt(s[3]),
                Integer.parseInt(s[4]),
                Integer.parseInt(s[5]),
                Integer.parseInt(s[6])
        ))
                .collect(Collectors.toList());

        weapons.sort(new Comparator<Weapon>() {
            @Override
            public int compare(Weapon o1, Weapon o2) {
                return Integer.compare(o1.getDamage(), o2.getDamage());
            }
        });

        weapons.sort((Weapon a, Weapon b) -> {
            if (b.getCombatType().compareTo(a.getCombatType()) == 0) {
                if (b.getDamageType().compareTo(a.getDamageType()) == 0) {
                    return b.getName().compareTo(a.getName());
                } else {
                    return b.getDamageType().compareTo(a.getDamageType());
                }
            } else {
                return b.getCombatType().compareTo(a.getCombatType());
            }
        });

        return weapons;
    }

    public CombatType toCombatType(String s) {
        if (s.equals("MELEE")) {
            return CombatType.MELEE;
        } else if (s.equals("RANGED")) {
            return CombatType.RANGED;
        } else if (s.equals("NONE")) {
            return CombatType.NONE;
        }
        return null;
    }

    public DamageType toDamageType(String s) {
        if (s.equals("SLASHING")) {
            return DamageType.SLASHING;
        } else if (s.equals("MISSILE")) {
            return DamageType.MISSILE;
        } else if (s.equals("BLUNT")) {
            return DamageType.BLUNT;
        } else if (s.equals("PIERCING")) {
            return DamageType.PIERCING;
        } else if (s.equals("NONE")) {
            return DamageType.NONE;
        }
        return null;
    }
}
