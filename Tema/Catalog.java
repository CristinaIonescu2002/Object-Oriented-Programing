package Tema;

import java.util.ArrayList;
import java.util.HashSet;

public class Catalog{
    private static Catalog catalog = null;
    private ArrayList<Course> cursuri;
    private ScoreVisitor sc = new ScoreVisitor();


    public Catalog() {}

    public static Catalog getInstance(){
        if(catalog == null)
            catalog = new Catalog();
        return catalog;
    }

    public void addCourse(Course course) {
        if (cursuri == null)
            cursuri = new ArrayList<Course>();
        cursuri.add(course);
    }
    public void removeCourse(Course course) {
        if(cursuri.contains(course)){
            cursuri.remove(cursuri.indexOf(course));
        }
    }

    public ArrayList<Course> getCursuri() {
        return cursuri;
    }

    public void afisareCursuri(){
        System.out.println("[ ");
        for(Course c : cursuri){
            System.out.println(c.getName());
        }
        System.out.println("]");
    }

    public ScoreVisitor getSc() {
        return sc;
    }

    public HashSet<Teacher> getAllTeachers(){
        HashSet<Teacher> profesori = new HashSet<>();
        for(Course c : this.getCursuri()){
            profesori.add(c.getProfesorTitular());
        }
        return profesori;
    }

    public HashSet<Assistant> getAllAssistants(){
        HashSet<Assistant> asistenti = new HashSet<>();
        for(Course c : this.getCursuri()){
            asistenti.addAll(c.getTotiAsistentii());
        }
        return asistenti;
    }
}
