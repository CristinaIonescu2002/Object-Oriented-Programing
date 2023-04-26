package Lab5.p4;

public class SNAKE_Warrior extends Warrior{
    public SNAKE_Warrior(int health, String name) {
        super(health, name);
    }
    public int getDamage(){
        return 10;
    }
    public String toString() {
        return "SNAKE_Warrior" + super.toString();
    }
}
