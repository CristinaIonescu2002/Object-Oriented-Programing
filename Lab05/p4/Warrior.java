package Lab5.p4;

/**
 *
 */
public class Warrior{
    //0 = dead, 100 = full strength
    public int health;
    public String name;

    public Warrior (int health, String name) {
        this.health = health;
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public int getDamage(){
        return 0;
    }

    public String toString() {
        return ": " + "health=" + health + ", name='" + name + '\'';
    }


}
