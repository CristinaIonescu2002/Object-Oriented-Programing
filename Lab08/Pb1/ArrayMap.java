package Lab8.Pb1;

import java.util.*;

public class ArrayMap< K, V> extends AbstractMap< K, V> {
    ArrayList<ArrayMapEntry<K,V>> arr = new ArrayList<>();

    public class ArrayMapEntry< K,V> implements Map.Entry<K,V>{
        private K key;
        private V value;
        public ArrayMapEntry(K key, V value){
            this.key =  key;
            this.value = value;
        }
        public K getKey(){
            return key;
        }
        public V getValue(){
            return value;
        }
        public V setValue(V value){
            V vRet = value;
            this.value=value;
            return vRet;

        }
        public String toString(){
            return "key: " + key + " " + "value: " + value;
        }
        public boolean equals(Object o){
            ArrayMapEntry< K, V> e2 = (ArrayMapEntry<K, V>)o;
            return (this.getKey()==null ?
                    e2.getKey()==null : this.getKey().equals(e2.getKey()))  &&
                    (this.getValue()==null ?
                            e2.getValue()==null : this.getValue().equals(e2.getValue()));
        }
        public int hashCode(){
            return (this.getKey()==null   ? 0 : this.getKey().hashCode()) ^
                    (this.getValue()==null ? 0 : this.getValue().hashCode());
        }
    }

    public Set entrySet(){
        HashSet<ArrayMapEntry<K,V>> set = new HashSet<>();
        for(int i=0; i<arr.size(); i++){
            set.add(arr.get(i));
        }
        return set;
    }
    public int size(){
        return super.size();
    }
    public V put(K key, V value){
        arr.add(new ArrayMapEntry<K, V>(key, value));
        return value;
    }


}
