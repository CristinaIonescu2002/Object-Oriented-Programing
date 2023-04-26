package Lab5.p4;

/**
 *
 */
import java.util.*;

public class WarriorPack {
    private Vector<Warrior> warriors ;

    public WarriorPack () {
        warriors = new Vector<Warrior>();
    }
    public void addWarrior(Warrior newWarrior) {
        warriors.add(newWarrior);
    }
    public Vector getWarriors() {
        return warriors ;
    }
    public int calculateDamage() {
        int damage = 0;
        for (int i = 0; i < warriors.size(); i++) {
//            if (warriors.get(i).getDamage()) {
//                //Snake does 10 damage
//                damage += 10;
//            } else if (warriors.get(i).type == Warrior.OGRE_Warrior) {
//                //Ogre does 6 damage
//                damage += 6;
//            } else if (warriors.get(i).type == Warrior.MARSHMALLOW_MAN_Warrior) {
//                //Marshmallow Man does 1 damage
//                damage += 1;
//            }
            damage+=warriors.get(i).getDamage();
        }
        return damage;
    }

    public String toString() {
        String rezultat = "";
        for(int i=0; i<warriors.size(); i++){
            rezultat += warriors.get(i).toString();
            rezultat += "\n";
        }
        return rezultat;
    }
}
