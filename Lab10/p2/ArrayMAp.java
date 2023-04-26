//package Lab10.p2;
//
//import Lab8.Pb1.ArrayMap;
//
//import java.util.*;
//
//public class ArrayMAp<K,V> extends AbstractMap<K,V> {
//    Vector<K> keys;
//    Vector<V> values;
//
//    public class ArrayEntry<K,V> implements Map.Entry<K,V>{
//        K key;
//        V value;
//
//        public ArrayEntry(K key, V value) {
//            this.key = key;
//            this.value = value;
//        }
//
//        public K getKey() {
//            return key;
//        }
//
//        public V getValue() {
//            return value;
//        }
//
//        public V setValue(V value) {
//            V rez = value;
//            this.value = value;
//            return rez;
//        }
//        public String toString(){
//            return "key: " + key + " " + "value: " + value;
//        }
//        public boolean equals(Object o){
//            ArrayEntry< K, V> e2 = (ArrayEntry<K, V>)o;
//            return (this.getKey()==null ?
//                    e2.getKey()==null : this.getKey().equals(e2.getKey()))  &&
//                    (this.getValue()==null ?
//                            e2.getValue()==null : this.getValue().equals(e2.getValue()));
//        }
//        public int hashCode(){
//            return (this.getKey()==null   ? 0 : this.getKey().hashCode()) ^
//                    (this.getValue()==null ? 0 : this.getValue().hashCode());
//        }
//    }
//
//    public String toString(){
//        String rezultat="" + "Keys: ";
//        for(int i=0; i<keys.size(); i++)
//            rezultat+=keys.get(i)+" ";
//        rezultat+="\n" + "Values: ";
//        for(int i=0; i<values.size(); i++)
//            rezultat+=values.get(i)+" ";
//        return rezultat;
//    }
//    public V put(K key, V value){
//        keys.add(key);
//        values.add(value);
//        return value;
//    }
//    public V get(Object ob){
//        if(keys.contains(ob))
//            return values.get(keys.indexOf(ob));
//        return null;
//    }
//    public Set<K> keySet(){
//
//
//    }
//    public Collection<V> values(){
//
//    }
////    public Set<Map.Entry<K, V>> entrySet(); // atentie! Se va defini o clasa interna pentru o intrare in dictionar - **//Map.Entry//**
//
//    public Set<Map.Entry<K, V>> entrySet() {
//        HashSet<ArrayEntry<K,V>> set = new HashSet<>();
//        for(int i=0; i<arr.size(); i++){
//            set.add(arr.get(i));
//        }
//        return set;
//    }
//}
