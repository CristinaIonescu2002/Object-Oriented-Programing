package Lab5.p3;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    public void myRead(Vector vector) throws NumarNegativ {
        Scanner keyboard = new Scanner(System.in);
        int myint = 0;
        while (myint >= 0) {
            System.out.print("Numar:");
            myint = keyboard.nextInt();
            if (myint >= 0)
                vector.add(myint);
            if (myint < 0)
                throw new NumarNegativ("Numarul introdus este negativ!");
        }
    }

    public static void main(String[] args) {
        Vector vector = new Vector<>();

        try {
            Main obiect = new Main();
            obiect.myRead(vector);
        } catch (NumarNegativ e) {
            System.out.println(e);
        }

        int maxim = (int) Collections.max(vector);
        System.out.println("Max este: " + maxim);


    }
}
