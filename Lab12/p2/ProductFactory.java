package Lab12.p2;

public class ProductFactory {
    public static Product factory(String type, String numeProdus, float productPret){
        if(type.equals("Book")){
            return new Book(productPret, numeProdus);
        }else if(type.equals("Food")){
            return new Food(productPret, numeProdus);
        }else if(type.equals("Beverage")){
            return new Beverage(productPret, numeProdus);
        }else if(type.equals("Computer")){
            return new Computer(productPret, numeProdus);
        }
        return null;
    }
}
