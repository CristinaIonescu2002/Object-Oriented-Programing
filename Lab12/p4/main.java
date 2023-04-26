package Lab12.p4;

public class main {
    public static void main(String[] args) {
        Pensionar p1 = new Pensionar(1,2000, new TwentyStrategy());
        Pensionar p2 = new Pensionar(12,2000, new ThirtyStrategy());
        Pensionar p3 = new Pensionar(15,2000, new FortyStrategy());

        System.out.println(p1.getPensie());
        System.out.println(p2.getPensie());
        System.out.println(p3.getPensie());
    }
}
