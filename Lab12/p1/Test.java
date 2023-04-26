package Lab12.p1;

public class Test {
    public static void main(String[] args) {
        ShopSigleton magazin = ShopSigleton.getInstance();

        magazin.setName("Auchan");

        Product p1 = new Product(17.5f,"Ananas");
        Product p2 = new Product(2.0f,"Guma");
        Product p3 = new Product(5.4f,"Pufarine");

        magazin.addProduct(p1);
        magazin.addProduct(p2);
        magazin.addProduct(p3);

        System.out.println("Produse dupa adaugare:");
        magazin.showProducts();

        magazin.removeProduct(p2);

        System.out.println("Produse dupa stergere:");
        magazin.showProducts();

        System.out.println("Cel mai ieftin produs: " + magazin.getCheapestProduct().getNume());


    }
}
