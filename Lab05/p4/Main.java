package Lab5.p4;

public class Main {
    public static void main(String[] args) {
        MARSHMALLOW_MAN_Warrior w1 = new MARSHMALLOW_MAN_Warrior(100, "puf");
        OGRE_Warrior w2 = new OGRE_Warrior(300, "Tactu");
        SNAKE_Warrior w3 = new SNAKE_Warrior(50, "Shhh");
        SNAKE_Warrior w4 = new SNAKE_Warrior(60, "Puiu");

        WarriorPack pack = new WarriorPack();
        pack.addWarrior(w1);
        pack.addWarrior(w2);
        pack.addWarrior(w3);
        pack.addWarrior(w4);

        System.out.println("Damage = " + pack.calculateDamage());
        System.out.println("Warriorrrrr:");
        System.out.println(w4);
        System.out.println("Packkkkk:");
        System.out.println(pack);
    }
}
