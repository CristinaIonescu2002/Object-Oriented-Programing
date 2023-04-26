package Lab3.prob2;

public class Main {
    public static void main(String[] args) {
        Produs p1 = new Produs("mar", 5, 2);
        Produs p2 = new Produs("lapte", 10, 6);

        System.out.println(p1);
        System.out.println(p1.getTotalProdus());

        Magazin m1= new Magazin("Auchan",new Produs("ciocolata", 8, 1),new Produs("hell", 3, 3),new Produs("suc", 1, 5));
        System.out.println(m1);
        System.out.println("Total magazin:");
        System.out.println(m1.getTotalMagazin());

    }
}
