package Lab12.p2;

public class Food extends Product{
    public Food(float pret, String nume) {
        super(pret, nume);
    }

    public float getPriceRedused() {
        float pret = this.pret - this.pret * 20 / 100;
        return pret;
    }
}
