package Lab4.pb1;

import static java.lang.Math.sin;

public class Paralelogram extends Patrulater{

    public Paralelogram(){
        super();
    }

    public Paralelogram(int latura1, int latura2, double unghi1,double unghi2){
        super(latura1,latura2,latura1,latura2,unghi1,unghi2,unghi1,unghi2);
    }

    public double arieParalelogram(){
        return latura1*latura2*sin(unghi1);
    }
}
