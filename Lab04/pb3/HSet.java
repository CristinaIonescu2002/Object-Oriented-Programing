package Lab4.pb3;

import java.util.Hashtable;

public class HSet extends Hashtable {
    public boolean add(Object value){
       if(this==null || this.contains(value))
           return false;
       this.put(value,value);
        return true;
    }

    public Object remove(Object key){
        Object rezultat = this.get(key);
        super.remove(key);
        return rezultat;
    }

    public String toString() {
        return super.toString();
    }
}
