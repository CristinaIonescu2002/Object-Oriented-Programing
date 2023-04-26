package Lab12.p4;

public class TwentyStrategy implements Strategy{
    public float calcul(int aniVechime, float salariu) {
        float pensie = ((float) aniVechime / 20) * salariu;
        return pensie;
    }
}
