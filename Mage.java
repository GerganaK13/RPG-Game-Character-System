public class Mage extends Character {
    int intelligence;
    int spellPower;

    public Mage(String name, int health, int mana, int level, int intelligence, int spellPower) {
        super(name, health, mana, level);
        this.intelligence = intelligence;
        this.spellPower = spellPower;
    }
    @Override
    public void castSpell(Character target) {
        int damage = this.spellPower + (this.intelligence / 2);
        target.health -= damage;
        this.mana -= 10;
        System.out.println(this.name + " casts a powerful spell on " + target.name + " dealing " + damage + " damage. Mana left: " + this.mana);
    }
    public void meditate() {
        this.mana += 10;
        System.out.println(this.name + " meditates to regain mana. Mana now: " + this.mana);
    }
}
