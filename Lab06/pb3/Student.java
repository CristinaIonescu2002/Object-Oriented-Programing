package Lab6.pb3;

import java.util.Vector;

public class Student implements Persoana{
    private String name;
    private Vector<Double> medii;

    public Student(String name, double medie) {
        this.name = name;
        medii = new Vector<Double>();
        medii.add((Double) medie);
    }

    public double calculMedieGenerala() {
        double suma=0;
        for(int i=0; i<medii.size(); i++)
            suma += medii.get(i);
        return suma/medii.size();
    }

    public String getNume() {
        return name;
    }

    public void setNume(String nume) {
        this.name = name;
    }

    public void addMedie(double medie) {
        medii.add(medie);
    }

    public int compareTo(Object o) {
        if (o == null) throw new NullPointerException ();
        if (!( o instanceof Persoana ))
            throw new ClassCastException ("Nu pot compara !");
        Persoana p = (Persoana)o;
        if(this.calculMedieGenerala() == p.calculMedieGenerala()){
            return name.compareTo(p.getNume());
        }
        return (int) (this.calculMedieGenerala()-p.calculMedieGenerala());
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", medii=" + medii +
                '}';
    }
}
