package Lab12.p2;

public abstract class Product {
    float pret;
    String nume;

    public Product(float pret, String nume) {
        this.pret = pret;
        this.nume = nume;
    }

    public float getPret() {
        return pret;
    }

    public String getNume() {
        return nume;
    }

    public abstract float getPriceRedused();
}
