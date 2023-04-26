package Lab12.p5;

abstract class Repository {
    private String name;
    // numele unui fisier sau folder (de fapt, calea acestuia)

    public String getName() {
        return name;
    }
    public abstract void accept (Visitor f);
}
