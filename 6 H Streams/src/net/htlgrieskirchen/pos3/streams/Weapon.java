package net.htlgrieskirchen.pos3.streams;

import java.util.Objects;

public class Weapon {

    private final String name;
    private final CombatType combatType;
    private final DamageType damageType;
    private final int damage;
    private final int speed;
    private final int minStrength;
    private int value;

    public Weapon(String name, CombatType combatType, DamageType damageType, int damage, int speed, int minStrength, int value) {
        this.name = name;
        this.combatType = combatType;
        this.damageType = damageType;
        this.damage = damage;
        this.speed = speed;
        this.minStrength = minStrength;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public CombatType getCombatType() {
        return combatType;
    }

    public DamageType getDamageType() {
        return damageType;
    }

    public int getDamage() {
        return damage;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMinStrength() {
        return minStrength;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.name);
        hash = 19 * hash + Objects.hashCode(this.combatType);
        hash = 19 * hash + Objects.hashCode(this.damageType);
        hash = 19 * hash + this.damage;
        hash = 19 * hash + this.speed;
        hash = 19 * hash + this.minStrength;
        hash = 19 * hash + this.value;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return true;
    }

    @Override
    public String toString() {
        return name + " " + combatType + " " + damageType + " " + damage + " " + speed + " " + minStrength + " " + value;
    }

}
