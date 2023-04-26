package Lab12.p3;

public class main {
    public static void main(String[] args) {
        Channel c = new Channel("Faiar");

        User u1 = new User("KimAngel2002");
        User u2 = new User("RMN");
        User u3 = new User("Bella");
        User u4 = new User("Ratatata");

        c.subescribe(u1);
        c.subescribe(u2);
        c.subescribe(u3);
        c.subescribe(u4);

        System.out.println("Afisare abonati: ");
        c.afisareAbonati();

        c.unsubscribe(u4);

        System.out.println("Afisare abonati dupa stergere:");
        c.afisareAbonati();

        c.notify("A aparut un video nou!");
    }
}
