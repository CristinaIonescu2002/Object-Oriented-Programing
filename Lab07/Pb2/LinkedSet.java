package Lab7.Pb2;

import java.util.LinkedList;
import java.util.Set;

public class LinkedSet extends LinkedList implements Set {
    public boolean add(Object obj){
        if(!this.contains(obj))
            super.add(obj);
        else return false;
        return true;
    }
    public void add(int i, Object obj){
        if(!this.contains(obj))
            super.add(i, obj);
    }
    public Object set(int i , Object obj){
        if(!this.contains(obj)){
            Object ob=get(i);
            super.set(i, obj);
            return ob;
        }else return null;
    }
}
