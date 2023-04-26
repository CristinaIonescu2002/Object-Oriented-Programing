package Tema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ScoreVisitor implements Visitor{
    HashMap<Teacher,ArrayList<Tuple>> examScores = new HashMap<>();
    HashMap<Assistant,ArrayList<Tuple>> partialScores = new HashMap<>();

    public ScoreVisitor() {}

    private static class Tuple{
        private final Student student;
        private final String numeCurs;
        private final Double nota;

        public Tuple(Student student, String numeCurs, Double nota) {
            this.student = student;
            this.numeCurs = numeCurs;
            this.nota = nota;
        }

        public Student getStudent() {
            return student;
        }

        public String getNumeCurs() {
            return numeCurs;
        }

        public Double getNota() {
            return nota;
        }
    }

    public void setExamScores(Teacher teacher, Student student, String numeCurs, Double nota) {
        Tuple tuple = new Tuple(student, numeCurs, nota);
        if(examScores.containsKey(teacher)){
            examScores.get(teacher).add(tuple);
        }else{
            ArrayList<Tuple> t = new ArrayList<>();
            t.add(tuple);
            examScores.put(teacher,t);
        }
    }

    public void setPartialScores(Assistant assistant, Student student, String numeCurs, Double nota) {
        Tuple tuple = new Tuple(student, numeCurs, nota);
        if(partialScores.containsKey(assistant)){
            partialScores.get(assistant).add(tuple);
        }else{
            ArrayList<Tuple> t = new ArrayList<>();
            t.add(tuple);
            partialScores.put(assistant,t);
        }
    }

    public void removeExamScore(Teacher teacher, Tuple tuple) {
        if(examScores.get(teacher).size()==1)
            examScores.remove(teacher);
        else{
            ArrayList<Tuple> array = examScores.get(teacher);
            array.remove(tuple);
            examScores.put(teacher,array);
        }
    }

    public void removePartialScore(Assistant assistant, Tuple tuple) {
        if(partialScores.get(assistant).size()==1)
            partialScores.remove(assistant);
        else{
            ArrayList<Tuple> array = partialScores.get(assistant);
            array.remove(tuple);
            partialScores.put(assistant,array);
        }
    }

    public void afisareExamenScores(){
        int cateNote = 0;
        for(Map.Entry<Teacher,ArrayList<Tuple>> entry : examScores.entrySet()){
            ArrayList<Tuple> tuples = entry.getValue();
            for(Tuple t : tuples){
                System.out.println(entry.getKey() + " --" + t.getNumeCurs() + "-- " +
                        t.getStudent() + " " + t.getNota());
                cateNote++;
            }
        }
        System.out.println("\n !!!!!!!!!! Sunt " + cateNote + " note netrecute in Catalog pentru examen!\n\n");
    }

    public void afisarePartialScores(){
        int cateNote = 0;
        for(Map.Entry<Assistant,ArrayList<Tuple>> entry : partialScores.entrySet()){
            ArrayList<Tuple> tuples = entry.getValue();
            for(Tuple t : tuples) {
                System.out.println(entry.getKey() + " --" + t.getNumeCurs() + "-- " +
                        t.getStudent() + " " + t.getNota());
                cateNote++;
            }
        }
        System.out.println("\n !!!!!!!!!! Sunt " + cateNote + " note netrecute in Catalog pentru partial!\n\n");
    }

    public void visit(Assistant assistant) {
        ArrayList<Tuple> tuples = partialScores.get(assistant);
        if(tuples == null)
            return;
        Catalog catalog = Catalog.getInstance();
        while(tuples.size()>1){
            Tuple t = tuples.get(0);
            for(Course curs : catalog.getCursuri()){
                if(curs.getName().equals(t.getNumeCurs())){
                    curs.getGrade(t.getStudent()).setPartialScore(t.getNota());
                    t.getStudent().notifyObservers(curs.getGrade(t.getStudent()));
                    this.removePartialScore(assistant,t);
                    break;
                }
            }
            tuples = partialScores.get(assistant);
        }

        Tuple t = tuples.get(0);
        for(Course curs : catalog.getCursuri()){
            if(curs.getName().equals(t.getNumeCurs())){
                curs.getGrade(t.getStudent()).setPartialScore(t.getNota());
                t.getStudent().notifyObservers(curs.getGrade(t.getStudent()));
                this.removePartialScore(assistant,t);
                break;
            }
        }
    }

    public void visit(Teacher teacher) {
        ArrayList<Tuple> tuples = examScores.get(teacher);
        if(tuples == null)
            return;
        Catalog catalog = Catalog.getInstance();
        while(tuples.size()>1){
            Tuple t = tuples.get(0);
            for(Course curs : catalog.getCursuri()){
                if(curs.getName().equals(t.getNumeCurs())){
                    curs.getGrade(t.getStudent()).setExamScore(t.getNota());
                    t.getStudent().notifyObservers(curs.getGrade(t.getStudent()));
                    this.removeExamScore(teacher,t);
                    break;
                }
            }
            tuples = examScores.get(teacher);
        }
        Tuple t = tuples.get(0);
        for(Course curs : catalog.getCursuri()) {
            if (curs.getName().equals(t.getNumeCurs())) {
                curs.getGrade(t.getStudent()).setExamScore(t.getNota());
                t.getStudent().notifyObservers(curs.getGrade(t.getStudent()));
                this.removeExamScore(teacher, t);
                break;
            }
        }
    }
}
