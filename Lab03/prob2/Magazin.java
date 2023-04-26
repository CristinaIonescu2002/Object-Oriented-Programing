package Lab3.prob2;

public class Magazin {
    String nume;
    Produs p1,p2,p3;

    public Magazin(String nume, Produs p1, Produs p2, Produs p3) {
        this.nume = nume;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public String toString(){
        return nume + ":\n" + p1 + "\n" + p2 + "\n" + p3;
    }

    public double getTotalMagazin(){
        return p1.getTotalProdus()+p2.getTotalProdus()+p3.getTotalProdus();
    }
}
