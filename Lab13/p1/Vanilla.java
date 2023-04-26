package Lab13.p1;

public class Vanilla extends ToppingDecorator{
    Vanilla(IceCream cream) {
        super(cream);
        System.out.println("Adding vanilla");
    }


    @Override
    public String getDescription() {
        return super.getDescription() + " Vanilla";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2;
    }
}
