package net.htlgrieskirchen.pos3.streams;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Streams {

    public double average(int[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / numbers.length;
    }

    public List<String> upperCase(String[] strings) {
        List<String> upperCase_Strings = new ArrayList<>();
        for (String string : strings) {
            upperCase_Strings.add(string.toUpperCase());
        }
        return upperCase_Strings;
    }

    public Weapon findWeaponWithLowestDamage(List<Weapon> weapons) {
        if (weapons.isEmpty()) {
            return null;
        }
        Weapon lowestDamageWeapon = weapons.get(0);
        if (weapons.size() > 1) {
            for (int i = 1; i < weapons.size(); i++) {
                if (weapons.get(i).getDamage() <= lowestDamageWeapon.getDamage()) {
                    lowestDamageWeapon = weapons.get(i);
                }
            }
        }
        return lowestDamageWeapon;
    }

    public Weapon findWeaponWithLowestDamageStream(List<Weapon> weapons) {
        Weapon[] lowestDamageWeapon = {weapons.get(0)};
        weapons.forEach(name -> {
            if((name.getDamage()) <= lowestDamageWeapon[0].getDamage()) lowestDamageWeapon[0] = name;
        });
        return lowestDamageWeapon[0];
    }

    public Weapon findWeaponWithHighestStrength(List<Weapon> weapons) {

        if (weapons.isEmpty()) {
            return null;
        }
        int highestStrength = weapons.get(0).getMinStrength();
        Weapon highestStrengthWeapon = weapons.get(0);
        for (int i = 1; i < weapons.size(); i++) {
            if (weapons.get(i).getMinStrength() >= highestStrength) {
                highestStrength = weapons.get(i).getMinStrength();
                highestStrengthWeapon = weapons.get(i);
            }
        }
        return highestStrengthWeapon;
    }

    public Weapon findWeaponWithHighestStrengthStream(List<Weapon> weapons) {
        Weapon[] highestStrengtWeapon = {null};
        weapons.forEach(name -> {
            if((name.getMinStrength()) >= highestStrengtWeapon[0].getMinStrength()) highestStrengtWeapon[0] = name;
        });
        return highestStrengtWeapon[0];
    }

    public List<Weapon> collectMissileWeapons(List<Weapon> weapons) {
        List<Weapon> missileWeapons = new ArrayList<>();
        for (int i = 0; i < weapons.size(); i++) {
            if (weapons.get(i).getDamageType().equals(DamageType.MISSILE)) {
                missileWeapons.add(weapons.get(i));
            }
        }
        return missileWeapons;
    }

    public List<Weapon> collectMissileWeaponsStream(List<Weapon> weapons) {
        List<Weapon> missileWeapons = new ArrayList<>();
        weapons.forEach(name -> {
            if((name.getDamageType()).equals(DamageType.MISSILE)) missileWeapons.add(name);
        });
        return missileWeapons;
    }

    public Weapon findWeaponWithLongestName(List<Weapon> weapons) {
        int maxNumberOfChar = 0;
        Weapon longestNamedWeapon = null;
        if (weapons.isEmpty()) {
            return null;
        } else if (weapons.get(0).getName() == null) {
            longestNamedWeapon = weapons.get(0);
        } else if (weapons.get(0).getName() != null) {
            for (int i = 0; i < weapons.size(); i++) {
                if (weapons.get(i).getName().length() >= maxNumberOfChar) {
                    maxNumberOfChar = weapons.get(i).getName().length();
                    longestNamedWeapon = weapons.get(i);
                }
            }
        }
        return longestNamedWeapon;
    }

    public Weapon findWeaponWithLongestNameStream(List<Weapon> weapons) {
        Weapon[] weaponWithlongestName = {weapons.get(0)};
        weapons.forEach(name -> {
            if((name.getName()).length() >= weaponWithlongestName[0].getName().length()) weaponWithlongestName[0] = name;
        });
        return weaponWithlongestName[0];
    }

    public List<String> toNameList(List<Weapon> weapons) {
        List<String> nameList = new ArrayList<>();
        for (int i = 0; i < weapons.size(); i++) {
            nameList.add(weapons.get(i).getName());
        }
        return nameList;
    }

    public List<String> toNameListStream(List<Weapon> weapons) {
        List<String> names = new ArrayList<>();
        weapons.forEach(name -> {
            names.add(name.getName());
        });
        return names;
    }

    public int[] toSpeedArray(List<Weapon> weapons) {
        int[] speedArray = new int[weapons.size()];
        for (int i = 0; i < weapons.size(); i++) {
            speedArray[i] = weapons.get(i).getSpeed();
        }
        return speedArray;
    }

    public AtomicInteger[] toSpeedArrayStream(List<Weapon> weapons) {
        AtomicInteger[] speeds = new AtomicInteger[weapons.size()];
        AtomicInteger i = new AtomicInteger(0);
        weapons.forEach(name -> {
            speeds[i.intValue()] = (new AtomicInteger(name.getSpeed()));
            i.set(i.intValue()+1);
        });
        return speeds;
    }

    public int sumUpValues(List<Weapon> weapons) {
        int values = 0;
        for (int i = 0; i < weapons.size(); i++) {
            values += weapons.get(i).getValue();
        }
        return values;
    }

    public int sumUpValuesStream(List<Weapon> weapons) {
        AtomicInteger valueSum = new AtomicInteger(0);
        weapons.forEach(name -> {
            valueSum.set(valueSum.intValue() + name.getValue());
        });
        return valueSum.intValue();
    }

    public long sumUpHashCodes(List<Weapon> weapons) {
        long HashCodeSum = 0;
        for (int i = 0; i < weapons.size(); i++) {
            HashCodeSum += weapons.get(i).hashCode();
        }
        return HashCodeSum;
    }

    public long sumUpHashCodesStream(List<Weapon> weapons) {
        AtomicLong hashCodeSum = new AtomicLong(0);
        weapons.forEach(name -> {
        hashCodeSum.set(hashCodeSum.longValue() + name.hashCode());
        });
        return hashCodeSum.longValue();
    }

    public List<Weapon> removeDuplicates(List<Weapon> weapons) {
        Set<Weapon> set = new LinkedHashSet<>();
        set.addAll(weapons);
        List<Weapon> weaponsWithoutDuplicates = new ArrayList<>();
        weaponsWithoutDuplicates.addAll(set);
        return weaponsWithoutDuplicates;
    }

    public List<Weapon> removeDuplicatesStream(List<Weapon> weapons) {
        Set<Weapon> set = new LinkedHashSet<>();
        set.addAll(weapons);
        List<Weapon> weaponsWithoutDuplicates = new ArrayList<>();
        weaponsWithoutDuplicates.addAll(set);
        return weaponsWithoutDuplicates;
    }

    public void increaseValuesByTenPercent(List<Weapon> weapons) {
        for (int i = 0; i < weapons.size(); i++) {
            weapons.get(i).setValue(weapons.get(i).getValue() + ((weapons.get(i).getValue() * 10) / 100));
        }
    }

    public List<Weapon> increaseValuesByTenPercentStream(List<Weapon> weapons) {
        weapons.forEach(name ->{
            name.setValue(name.getValue() + (name.getValue() * 10/100));
        });
        return weapons;
    }
}
