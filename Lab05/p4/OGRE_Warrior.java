package Lab5.p4;

public class OGRE_Warrior extends Warrior{
    public OGRE_Warrior(int health, String name) {
        super(health, name);
    }
    public int getDamage(){
       return 6;
    }
    public String toString() {
        return "OGRE_Warrior" + super.toString();
    }
}
