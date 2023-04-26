package Lab6.pb3;

import java.util.Collections;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Student> vect = new Vector<Student>();
        vect.add(new Student("Ramona", 10));
        vect.get(0).addMedie(9.50);
        vect.get(0).addMedie(8.75);
        vect.get(0).addMedie(9.45);
        vect.get(0).addMedie(9.90);

        vect.add(new Student("Adi", 10));
        vect.get(1).addMedie(9.50);
        vect.get(1).addMedie(8.75);
        vect.get(1).addMedie(9.45);
        vect.get(1).addMedie(9.90);

        vect.add(new Student("Rares", 10));
        vect.get(2).addMedie(9.50);
        vect.get(2).addMedie(8.90);
        vect.get(2).addMedie(9.50);
        vect.get(2).addMedie(8);

        vect.add(new Student("Ramona", 10));
        vect.get(3).addMedie(9.50);
        vect.get(3).addMedie(8.90);
        vect.get(3).addMedie(10);
        vect.get(3).addMedie(10);

        System.out.println(vect.get(0));
        System.out.println(vect.get(0).calculMedieGenerala());

        Collections.sort(vect);

        for(int i=0; i<vect.size(); i++){
            System.out.println(vect.get(i));
        }

    }
}
