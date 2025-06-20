package org.example;

public class Mage extends Character {
    private String spells;

    public Mage(String name, String spells, int health, int attackPower) {
        super(name, health, attackPower);
        this.spells = spells;
    }

    public String getSpells() {
        return spells;
    }

    public void setSpells(String spells) {
        this.spells = spells;
    }

    @Override
    public String  attack() {
        return getName() + " Attack with " + getSpells() + " for " + getAttackPower() + " damage.";
    }
}
