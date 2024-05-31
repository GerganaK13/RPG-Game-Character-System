public class Warrior extends Character {
    int strength;
    int armor;

    public Warrior(String name, int health, int mana, int level, int strength, int armor) {
        super(name, health, mana, level);
        this.strength = strength;
        this.armor = armor;
    }

    @Override
    public void attack(Character target) {
        int damage = this.strength - (target instanceof Warrior ? ((Warrior) target).armor : 0);
        target.health -= damage;
        System.out.println(this.name + " strikes " + target.name + " with strength " + this.strength + " dealing " + damage + " damage.");
    }

    public void useShield() {
        this.armor += 5;
        System.out.println(this.name + " uses shield to increase armor to " + this.armor);
    }
}
