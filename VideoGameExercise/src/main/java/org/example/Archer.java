package org.example;

public class Archer extends Character{
    private String arrowType;

    public Archer(String name, String arrowType, int health, int attackPower) {
        super(name, health, attackPower);
        this.arrowType = arrowType;
    }

    public String getArrowType() {
        return arrowType;
    }

    public void setArrowType(String arrowType) {
        this.arrowType = arrowType;
    }

    @Override
    public String attack() {
        return getName() + " used their " + getArrowType() + " to do " + getAttackPower() + " damage.";
    }
}
