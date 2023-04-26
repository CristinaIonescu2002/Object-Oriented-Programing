package Lab2;

import java.util.Random;
import java.util.Vector;

public class Pb3 {

    public int aparitii_Stergere(Vector vector, Integer x) {
        int ct = 0;
        for (int i = 0; i < vector.size(); i++) {
            if (x.equals(vector.get(i))) {
                ct++;
                vector.remove(i);
                i--;
            }
        }
        return ct;
    }

    public void main(Vector vector) {
        int min = (int) vector.get(0);
        int max = (int) vector.get(0);
        int suma=0;

        for (int i = 0; i < vector.size(); i++) {
            int nr = (int) vector.get(i);
            if (nr<min)
                min=nr;
            if(nr>max)
                max=nr;
            suma=suma+nr;
        }
        double medie=suma/vector.size();
        System.out.println("Min este "+min);
        System.out.println("Max este " +max);
        System.out.println("Media este "+ medie);
    }

    public static void main(String[] args) {
        Vector vector = new Vector();
        Random generator = new Random();

        for (int i = 0; i < 20; i++) {
            int nr = generator.nextInt(10);
            vector.add(nr);
        }

        System.out.println("Afisare sir:");
        for (int i = 0; i < vector.size(); i++) {
            System.out.print(vector.get(i) + " ");
        }
        System.out.println();

        Pb3 obiect = new Pb3();
        System.out.println(obiect.aparitii_Stergere(vector, 1));

        System.out.println("A doua varianta:");
        obiect.main(vector);

    }
}
