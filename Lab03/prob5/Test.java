package Lab3.prob5;

public class Test {
    public static void main(String[] args) {
        Punct p1=new Punct(2,8);
        Punct p2=new Punct(1,6);
        Punct p3=new Punct(1,16);
        Punct p4=new Punct(6,5);

        System.out.println(p3.distance(1,6));
        System.out.println(p2.distance(p3));

    }
}
