package hue3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
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
        )).collect(Collectors.toList());

        weapons.sort((Weapon o1, Weapon o2) -> Integer.compare(o1.getDamage(), o2.getDamage()));

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
        switch (s) {
            case "MELEE":
                return CombatType.MELEE;
            case "RANGED":
                return CombatType.RANGED;
            case "NONE":
                return CombatType.NONE;
            default:
                break;
        }
        return null;
    }

    public DamageType toDamageType(String s) {
        switch (s) {
            case "SLASHING":
                return DamageType.SLASHING;
            case "MISSILE":
                return DamageType.MISSILE;
            case "BLUNT":
                return DamageType.BLUNT;
            case "PIERCING":
                return DamageType.PIERCING;
            case "NONE":
                return DamageType.NONE;
            default:
                break;
        }
        return null;
    }
}
