package Lab6.pb0;

import java.util.Comparator;

public class Comp1 implements Comparator {
    public int compare(Object o1, Object o2){
        Pair p1=(Pair) o1;
        Pair p2=(Pair) o2;
        return ((Comparable)(p1.a)).compareTo(p2.a);
    }
}
