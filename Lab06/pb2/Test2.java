package Lab6.pb2;

import Lab6.pb1.Circle;
import Lab6.pb1.Rectangle;
import Lab6.pb1.Square;

public class Test2 {
    public static void main(String[] args) {
//        Rectangle rectangle1 = new Shape();   --- mai trebuie implrmentate niste metode
        Rectangle rectangle2 = new Square();

        Square sq=new Square(2);
        Rectangle rect=(Rectangle) sq;
        System.out.println(rect);

    //Conversie 1
        Circle c1 = new Circle();
//        Square sq = (Square) c1; --- no
    //Conversie 2
        Rectangle r = new Rectangle(5.0, 5.0);
//        sq = (Square) r;         --- no
    //Conversie 3
        sq = new Square(7.0);
        r = sq;



    }
}
