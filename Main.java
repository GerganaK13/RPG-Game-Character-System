public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Luke Skywalker", 100, 50, 3, 20, 15);
        Mage mage = new Mage("Gandalf", 75, 100, 2, 25, 30);
        Rogue rogue = new Rogue("Devil", 98, 45, 1, 30, 20);

        System.out.println("Initial State:");
        printCharacterStatus(warrior);
        printCharacterStatus(mage);
        printCharacterStatus(rogue);

        System.out.println("\nBattle Simulation:");
        warrior.attack(mage);
        mage.castSpell(warrior);
        rogue.attack(warrior);

        System.out.println("\nAfter Battle:");
        printCharacterStatus(warrior);
        printCharacterStatus(mage);
        printCharacterStatus(rogue);

        System.out.println("\nLeveling Up:");
        warrior.levelUp();
        mage.levelUp();
        rogue.levelUp();

        System.out.println("\nSpecial Abilities:");
        warrior.useShield();
        mage.meditate();
        rogue.hide();
    }
    public static void printCharacterStatus(Character character) {
        System.out.println(character.name + " - Health: " + character.health + ", Mana: " + character.mana + ", Level: " + character.level);
    }
}
