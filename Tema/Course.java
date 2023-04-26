package Tema;

import java.util.*;

public abstract class Course{
    private final String name;
    private final Teacher profesorTitular;
    private final HashSet<Assistant> asistenti;
    private final ArrayList<Grade> note;                    ///inainte facusem cu treeSet
    private final HashMap<String,Group> grupeDex;
    private final int credite;

    private TeacherStrategy strategy;
    private final Snapshot snapshot = new Snapshot();

    public void setStrategy(String strategy){
        switch (strategy) {
            case "BestPartialScore" -> this.strategy = new BestPartialScore();
            case "BestExamScore" -> this.strategy = new BestExamScore();
            case "BestTotalScore" -> this.strategy = new BestTotalScore();
        }
    }

    public TeacherStrategy getStrategy() {
        return strategy;
    }

    public void makeBackup(){
        try {
            snapshot.setBackUpNote(note);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
    public void undo(){
        if(snapshot != null){
            note.clear();
            note.addAll(snapshot.getBackUpNote());
        }
    }

    public abstract static class CourseBuilder{
        protected String name;
        protected Teacher profesorTitular;
        protected HashSet<Assistant> asistenti;
        protected ArrayList<Grade> note;
        protected HashMap<String,Group> grupeDex;
        int credite;

        public CourseBuilder(String name) {
            this.name = name;
            this.asistenti = new HashSet<Assistant>();
            this.note =  new ArrayList<Grade>();
            this.grupeDex = new HashMap<String,Group>();
        }
        public CourseBuilder prof(Teacher profesorTitular) {
            this.profesorTitular = profesorTitular;
            return this;
        }
        public CourseBuilder credite(int credite) {
            this.credite = credite;
            return this;
        }

        public abstract Course build();
    }
    private class Snapshot{
        ArrayList<Grade> backUpNote;

        public void setBackUpNote(ArrayList<Grade> note) throws CloneNotSupportedException {
            backUpNote = new ArrayList<Grade>();
            for(Grade n: note){
                backUpNote.add((Grade)n.clone());
            }
        }

        public ArrayList<Grade> getBackUpNote() {
            return backUpNote;
        }
    }

    public Course(CourseBuilder builder) {
        this.name = builder.name;
        this.profesorTitular = builder.profesorTitular;
        this.asistenti = builder.asistenti;
        this.note =  builder.note;
        this.grupeDex = builder.grupeDex;
        this.credite = builder.credite;
    }

    public void addAssistant(String ID, Assistant assistant){
        Group grupaGasita = grupeDex.get(ID);
        grupaGasita.setAssistant(assistant);
        asistenti.add(assistant);
    }

    public void addStudent(String ID, Student student){
        Group grupaGasita = grupeDex.get(ID);
        grupaGasita.addStudent(student);
    }

    public void addGroup(Group group){
        grupeDex.put(group.getID(),group);
    }

    public void addGroup(String ID, Assistant assistant){
        Group grupa = new Group(ID, assistant);
        grupeDex.put(ID,grupa);
    }

    public void addGroup(String ID, Assistant assist, Comparator<Student> comp) {
        Group grupa = new Group(ID, assist, comp);
        grupeDex.put(ID,grupa);
    }

    public Grade getGrade(Student student){
        for(Grade nota : note){
            if(nota.getStudent().equals(student))
                return nota;
        }
        return null;
    }

    public void addGrade(Grade grade){
        note.add(grade);
        Collections.sort(note);
    }

    public ArrayList<Student> getAllStudents(){
        ArrayList<Student> array = new ArrayList<Student>();
        for(Grade g : note){
            array.add(g.getStudent());
        }
        return array;
    }

    public HashMap<Student, Grade> gettAllStudentGrades(){
        HashMap<Student,Grade> situatie = new HashMap<Student,Grade>();
        for(Grade nota : note){
            situatie.put(nota.getStudent(),nota);
        }
        return situatie;
    }

    public Student getBestStudent() {
        return  strategy.getBestStudent(this);
    }

    public String getName() {
        return name;
    }

    public void setAsistenti(Assistant asistent) {
        asistenti.add(asistent);
    }

    public void setGrupe(Group grupa) {
        grupeDex.put(grupa.getID(), grupa);
    }

    public void setDexGrupe(Group grup){
        grupeDex.put(grup.getID(), grup);
    }

    public Teacher getProfesorTitular() {
        return profesorTitular;
    }

    public ArrayList<Assistant> getTotiAsistentii(){
        ArrayList<Assistant> asist = new ArrayList<>();
        for(Assistant a : asistenti){
            asist.add(a);
        }
        return asist;
    }

    public HashMap<String, Group> getGrupeDex() {
        return grupeDex;
    }

    public abstract ArrayList<Student> getGraduatedStudents();

}
