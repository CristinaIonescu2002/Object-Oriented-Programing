package Lab6.pb5;

import java.util.Vector;

public class Tren {
    Vector<Vagon> vagoane;
    public Tren() {
        vagoane = new Vector<Vagon>();
    }

    public void addVagon(Vagon v){
        vagoane.add(v);
    }

    public String toString() {
        String rezult = "Tren: \nVagoane: ";
        for(int i=0; i<vagoane.size(); i++){
            rezult += vagoane.get(i).getName() + " ";
        }
        return rezult;
    }
}
