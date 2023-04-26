package Lab10.p1;

public class StormFire extends BadLuck{

    void execute(Hero h) {
        System.out.println(h);
    }

    void execute(Warrior w) {
        System.out.println(w.toString());
    }

    void execute(Ninja n) {
        System.out.println(n.toString());
    }

    void execute(Rogue r) {
        System.out.println(r.toString());
    }
}
