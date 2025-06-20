package org.example;

public class App 
{
    public static void main( String[] args )
    {
        Character[] myCharacters = new Character[3];

        myCharacters[0] = new Warrior("Jerry", "Sword", 120, 500);
        myCharacters[1] = new Mage("Alexis", "Fire Spell", 250, 600);
        myCharacters[2] = new Archer("Harold", "explosive arrow", 100, 300);

        for(Character c: myCharacters) {
            System.out.println(c.attack());
        }
    }

}
