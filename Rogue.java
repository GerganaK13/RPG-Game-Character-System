public class Rogue extends Character {
    int agility;
    int dexterity;

    public Rogue(String name, int health, int mana, int level, int agility, int dexterity) {
        super(name, health, mana, level);
        this.agility = agility;
        this.dexterity = dexterity;
    }

    @Override
    public void attack(Character target) {
        int damage = this.dexterity + (this.agility / 2);
        target.health -= damage;
        System.out.println(this.name + " attacks " + target.name + " with dexterity " + this.dexterity + " dealing " + damage + " damage.");
    }

    public void hide() {
        this.agility += 5;
        System.out.println(this.name + " hides in the shadows, increasing agility to " + this.agility);
    }
}
