package org.example;

public class Warrior extends Character {
    private String weaponType;


    public Warrior(String name, String weaponType, int health, int attackPower) {
        super(name, health, attackPower);
        this.weaponType = weaponType;


    }
    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public String attack() {
        return getName() + " used their " + getWeaponType() + " to attack for " + getAttackPower();

    }

}
