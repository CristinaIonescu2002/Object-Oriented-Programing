//package Lab7.Pb3;
//
//import java.util.*;
//
//public class SListSet extends LinkedList implements SortedSet{
//    private Comparator comparator;
//
//    public SListSet() {
//        comparator=null;
//    }
//
//    public SListSet(Comparator comparator) {
//        this.comparator = comparator;
//    }
//
//    public Comparator comparator (){
//        return comparator;
//    } //comparator folosit (null pentru  comparatia naturala)
//
//    public boolean add(Object o){
//        if(!super.contains(o)){
//            super.add(o);
//            Collections.sort(this);
//            return true;
//        }else return false;
//    } //adauga un elemnt in multime daca nu exista deja si sorteaza multimea
//
//    public Object first(){
//        if(super.size()==0)
//            return null;
//        else return super.get(0);
//    } //primul obiect din multime
//
//    public Object last(){
//        if(super.size()==0)
//            return null;
//        else return super.get(super.size()-1);
//    } // ultimul obiect din multime
//
//
//
//
//    public SortedSet subSet(Object from, Object to){
//        int i=super.indexOf(from);
//        int j=super.indexOf(to);
//        SortedSet srt = (SortedSet) super.subList(i,j);
//
//        return srt;
//    } // o submultime ordonata
//
//    public SortedSet headSet(Object to){
//        int j=super.indexOf(to);
//        SortedSet srt = (SortedSet) super.subList(0,j);
//
//        return srt;
//    }// o submultime cu primele  obiecte
//
//    SortedSet tailSet(Object from){
//        int i=super.indexOf(from);
//        SortedSet srt = (SortedSet) super.subList(i,super.size()-1);
//
//        return srt;
//    } //o submultime cu ultimele obiecte
//
//
//    public static void main(String[] args) {
//        SListSet list =  new SListSet();
//
//
//    }
//
//}
