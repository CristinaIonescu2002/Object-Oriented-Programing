package Lab13.p1;

public class main {
    public static void main(String[] args) {
        IceCream iceCream = new Vanilla(new Chocolate(new BasicIceCream()));
        System.out.println("Ingrediente: " + iceCream.getDescription());
        System.out.println("Cost: " + iceCream.getCost());
    }
}
