package Lab5.p4;

public class MARSHMALLOW_MAN_Warrior extends Warrior{

    public MARSHMALLOW_MAN_Warrior(int health, String name) {
        super(health, name);
    }
    public int getDamage(){
        return 1;
    }
    public String toString() {
        return "MARSHMALLOW_MAN_Warrior" +super.toString();
    }
}
