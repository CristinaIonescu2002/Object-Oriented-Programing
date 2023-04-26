package Lab12.p5;

public class Fisier extends Repository{
    public void accept (Visitor f) {
        f.visit(this);
    }
}
