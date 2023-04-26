package Lab12.p2;

public class Computer extends Product{
    public Computer(float pret, String nume) {
        super(pret, nume);
    }

    public float getPriceRedused() {
        float pret = this.pret - this.pret * 10 / 100;
        return pret;
    }
}
