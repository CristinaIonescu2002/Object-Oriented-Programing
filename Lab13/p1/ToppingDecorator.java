package Lab13.p1;

public abstract class ToppingDecorator implements IceCream {
    private IceCream tempIceCream;

    ToppingDecorator(IceCream cream){
        tempIceCream = cream;
    }
    public String getDescription(){
        return this.tempIceCream.getDescription();
    }
    public double getCost(){
        return this.tempIceCream.getCost();
    }
}
