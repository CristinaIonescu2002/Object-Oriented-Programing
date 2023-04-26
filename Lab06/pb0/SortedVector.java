package Lab6.pb0;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class SortedVector extends Vector {
    Comparator c;
    public SortedVector(Comparator c){
        this.c=c;
    }
    public boolean add(Object o){
        super.add(o);
        Collections.sort(this,c);
        return true;
    }
}
