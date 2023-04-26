package Lab13.p1;

public class BasicIceCream implements IceCream{
    public BasicIceCream() {
        System.out.println("Adding cone");
    }

    public String getDescription() {
        return " Cone";
    }

    public double getCost() {
        return 0.5;
    }
}
