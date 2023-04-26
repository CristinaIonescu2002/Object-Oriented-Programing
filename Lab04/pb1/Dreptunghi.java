package Lab4.pb1;

public class Dreptunghi extends Paralelogram{

    public Dreptunghi(){
        super();
    }

    public Dreptunghi(int lungime, int latime){
        super(lungime, latime, 90, 90);
    }

    public double arieDreptunghi(){
        return latura1*latura2;
    }
}
