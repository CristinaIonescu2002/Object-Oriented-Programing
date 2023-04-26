package Lab4.pb1;

public class Romb extends Paralelogram{
    double diag1=0;
    double diag2=0;

    public Romb(){
        super();
    }

    public Romb(int latura, double unghi1, double unghi2, double diag1, double diag2){
        super(latura,latura,unghi1,unghi2);
        this.diag1=diag1;
        this.diag2=diag2;
    }

    public double arieRomb(){
        return (diag1*diag2)/2;
    }
}
