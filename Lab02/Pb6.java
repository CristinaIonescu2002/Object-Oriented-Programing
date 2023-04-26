package Lab2;

import java.util.Vector;

public class Pb6 {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(7.5);
        v.add("String");
        v.add(7);
        v.add("String");
        v.add(5);
        v.add(7.66F);
        v.add(7);
        v.add(true);
        int n =v.size();
//        System.out.println(v.get(0).getClass());
//        System.out.println(v.get(7).getClass());

        Vector v2= new Vector();
        Vector v3= new Vector();
        v2.add(v.get(0).getClass());
        v3.add(1);
        for(int i=1; i<n; i++){
            if(v2.contains(v.get(i).getClass())){
                int index = v2.indexOf(v.get(i).getClass());
                int valoare = (int) v3.get(index);
                valoare++;
                v3.set(index,valoare);

            }else{
                v2.add(v.get(i).getClass());
                v3.add(1);
            }
        }
        for(int i=0; i<v2.size(); i++){
            System.out.println(v2.get(i) + " " + v3.get(i));
        }
    }
}
