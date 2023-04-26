package Lab3.prob2;

public class Produs {
    String nume;
    double pret;
    int cantinate;

    public Produs(String nume, double pret, int cantinate) {
        this.nume = nume;
        this.pret = pret;
        this.cantinate = cantinate;
    }

    public String toString(){
        return "Produs " + nume + " " + pret + " " + cantinate;
    }

    public double getTotalProdus(){
        return cantinate*pret;
    }
}
