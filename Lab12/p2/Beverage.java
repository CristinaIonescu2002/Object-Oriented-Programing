package Lab12.p2;

public class Beverage extends Product{
    public Beverage(float pret, String nume) {
        super(pret, nume);
    }

    public float getPriceRedused() {
        float pret = this.pret - this.pret * 5 / 100;
        return pret;
    }
}
