package Lab8.Pb2;

import java.util.Comparator;
import java.util.TreeSet;

public class Catalog extends TreeSet<Catalog.Student> {
    public Catalog (Comparator comparator) {
        super(comparator);
    }
    public Catalog ( ) {

    }
    class Student implements Comparable<Student>{
        private String name;
        private Double media;
        private int clazz;
        public int compareTo(Student st) {
            if(st.media<this.media)return 1;
            if(st.media>this.media)return -1;
            else {
                return st.name.compareTo(this.name);
            }
        }
    }

    public void addStudent(String name, double media, int clazz) {
        Catalog.Student st = new Catalog.Student();
        st.name = name;
        st.media = media;
        st.clazz = clazz;
        this.add(st);

    }
    public Student getStudent ( String name) {
        for(Student s : this)
        {
            if(s.name.equals(name))return s;
        }
        return null;
    }
    public void removeStudent ( String name) {
        for(Student s : this)
        {
            if(s.name.equals(name))this.remove((Object)s);
        }
    }
    public Catalog byClass (int clazz ) {
        Catalog c = new Catalog();
        for(Student s : this)
        {
            if(s.clazz == clazz)c.add(s);
        }
        return c;
    }

    public static void main(String args[]) {
        Catalog catalog = new Catalog();
        catalog.addStudent("Alexandru", 7, 324);
        catalog.addStudent("Ioana", 5, 321);
        catalog.addStudent("Maria", 10, 322);
        catalog.addStudent("Ionut", 6.2, 323);
        catalog.addStudent("Diana", 7, 322);

        Catalog catalog2 = new Catalog(new Comparator<Catalog.Student>() {
            @Override
            public int compare(Catalog.Student o1, Catalog.Student o2) {
                // TODO: Sort by average (descending) and by name (ascending).
                if(o1.media<o2.media)return 1;
                if(o1.media>o2.media)return -1;
                else {
                    return o1.name.compareTo(o2.name);
                }
            }
        });
        catalog2.addAll(catalog);

        System.out.println("Verificam...");
        System.out.println("Continutul colectiei: " + catalog);
        System.out.println("Continutul colectiei: " + catalog2);

        Catalog.Student last = null;
        for (Catalog.Student o : catalog) {
            if (last == null) {
                last = o;
                continue;
            }
            int r = last.media != o.media ? new Double(last.media).compareTo(o.media) : last.name.compareTo(o.name);
            if (r != last.compareTo(o)) {
                System.err.println("Catalog.Student.compareTo a fost implementata gresit.");
            }
        }

        if (catalog.size() != 5) {
            System.err.println("Catalog.size() a fost implementata gresit.");
        }

        catalog.removeStudent("Ionut");
        if (catalog.size() != 4) {
            System.err.println("Catalog.remove() a fost implementata gresit.");
        }
        catalog.removeStudent("");
        if (catalog.size() != 4) {
            System.err.println("Catalog.remove() a fost implementata gresit.");
        }

        if (catalog.byClass(322).size() != 2) {
            System.err.println("Catalog.byClass() a fost implementata gresit.");
        }

        catalog.removeStudent("Maria");
        if (catalog.byClass(322).size() != 1) {
            System.err.println("Catalog.remove() a fost implementata gresit.");
        }

        if (catalog.getStudent("Maria") != null) {
            System.err.println("Catalog.getStudent() a fost implementata gresit.");
        }

        if ((catalog.getStudent("Alexandru") == null) || (catalog.getStudent("Alexandru").media != 7)) {
            System.err.println("Catalog.getStudent() a fost implementata gresit.");
        }
    }

}