package Lab12.p4;

public class Pensionar {
    int aniVechime;
    float salariu;
    Strategy strategy;

    public Pensionar(int aniVechime, float salariu, Strategy strategy) {
        this.aniVechime = aniVechime;
        this.salariu = salariu;
        this.strategy = strategy;
    }

    public float getPensie(){
        return strategy.calcul(aniVechime,salariu);
    }
}
