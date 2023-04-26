package Lab13.p1;

public class Chocolate extends ToppingDecorator{
    Chocolate(IceCream cream) {
        super(cream);
        System.out.println("Adding Choco");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Choco";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }
}
