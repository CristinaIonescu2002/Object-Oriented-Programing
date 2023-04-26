package Lab12.p2;

public class Test {
    public static void main(String[] args) {
        ShopSigleton magazin = ShopSigleton.getInstance();

        magazin.setName("Auchan");

        Book p1 = (Book) ProductFactory.factory("Book","Carte",25.5f);
        Food p2 = (Food) ProductFactory.factory("Food","Ananas",17.5f);
        Beverage p3 = (Beverage) ProductFactory.factory("Beverage","Cola",3.3f);
        Computer p4 = (Computer) ProductFactory.factory("Computer","Aus",6000.3f);

        magazin.addProduct(p1);
        magazin.addProduct(p2);
        magazin.addProduct(p3);
        magazin.addProduct(p4);

        System.out.println("Produse dupa adaugare");
        magazin.showProducts();

        magazin.removeProduct(p2);

        System.out.println("Produse dupa stergere");
        magazin.showProducts();

        System.out.println("Cel mai ieftin produs " + magazin.getCheapestProduct().getNume());


    }
}
