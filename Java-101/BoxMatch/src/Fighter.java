public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;
    double chance = 0;


    Fighter(String name, int damage, int health, int weight, double dodge) {
        this.damage = damage;
        this.health = health;
        this.name = name;
        this.weight = weight;
        if (this.dodge < 0 || this.dodge > 100) {
            this.dodge = 0;
        }
        this.dodge = dodge;

    }

    int hit(Fighter foe, Fighter foe2) {
        int newHealth = foe.health - this.damage;
        if (foe.isDodge()) {
            System.out.println(foe2.name + " has dodged '" + foe.name + "' attack.");
            return foe.health;
        }
        if (newHealth < 0) {
            newHealth = 0;
        }
        System.out.println(this.name + " hit " + this.damage + " damage to " + foe.name + "\n" + "Health " + foe.name + " : " + newHealth);
        return newHealth;
    }

    boolean isDodge() {
        double randNum = Math.random() * 100;
        return randNum <= this.dodge;
    }

}
