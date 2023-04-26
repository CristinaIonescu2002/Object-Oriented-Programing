package Tema;

import java.util.Comparator;
import java.util.TreeSet;

public class Group extends TreeSet<Student> {
    private Assistant assistant;
    private String ID;
    private Comparator comp;

    public void addStudent(Student student){
        super.add(student);
    }

    public TreeSet<Student> getStudents(){
        return this;
    }

    public void removeStudent(Student student){
        super.remove(student);
    }

    public void setAssistant(Assistant assistant) {
        this.assistant = assistant;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setComp(Comparator comp) {
        this.comp = comp;
    }

    public String getID() {
        return ID;
    }

    public Group(String ID, Assistant assistant, Comparator<Student> comp) {
        super(comp);
        this.ID = ID;
        this.assistant = assistant;
    }
    public Group(String ID, Assistant assistant) {
        this.ID = ID;
        this.assistant = assistant;
    }

    public Assistant getAssistant() {
        return assistant;
    }
}
