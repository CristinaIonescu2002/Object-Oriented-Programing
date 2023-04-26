package Lab12.p2;

public class Book extends Product{
    public Book(float pret, String nume) {
        super(pret, nume);
    }

    public float getPriceRedused() {
        float pret = this.pret - this.pret * 15 / 100;
        return pret;
    }
}
