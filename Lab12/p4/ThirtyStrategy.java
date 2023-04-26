package Lab12.p4;

public class ThirtyStrategy implements Strategy{
    public float calcul(int aniVechime, float salariu) {
        float pensie = ((float) aniVechime / 30) * salariu;
        return pensie;
    }
}
