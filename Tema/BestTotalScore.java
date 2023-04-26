package Tema;

import java.util.HashMap;
import java.util.Map;

public class BestTotalScore implements TeacherStrategy{

    public Student getBestStudent(Course curs) {
        HashMap<Student, Grade> toateNotele = curs.gettAllStudentGrades();
        Double notaMaxima = 0.0;
        Student studentMaxNota = null;
        for(Map.Entry<Student, Grade> n : toateNotele.entrySet()){
            Double notaTotala = n.getValue().getTotal();
            if(notaTotala > notaMaxima){
                notaMaxima = notaTotala;
                studentMaxNota = n.getKey();
            }
        }
        return studentMaxNota;
    }
}
