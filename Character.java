public class Character {
    String name;
    int health;
    int mana;
    int level;
    public Character(String name, int health, int mana, int level) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.level = level;
    }
    public void attack(Character target) {
        System.out.println(this.name + " attacks " + target.name);
    }
    public void defend() {
        System.out.println(this.name + " defends");
    }
    public void castSpell(Character target) {
        System.out.println(this.name + " casts a spell on " + target.name);
    }
    public void levelUp() {
        this.level++;
        this.health += 10;
        this.mana += 5;
        System.out.println(this.name + " upgrades to level " + this.level);
    }
}
