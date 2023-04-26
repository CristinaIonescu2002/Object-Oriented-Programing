package Lab12.p4;

public class FortyStrategy implements Strategy{
    public float calcul(int aniVechime, float salariu) {
        float pensie = ((float) aniVechime / 40) * salariu;
        return pensie;
    }
}
