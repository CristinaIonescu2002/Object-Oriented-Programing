package Tema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FullCourse extends Course{
    static class FullCoursebuilder extends CourseBuilder{

        public FullCoursebuilder(String name) {
            super(name);
        }

        public Course build() {
            return new FullCourse(this);
        }
    }

    public FullCourse(CourseBuilder builder) {
        super(builder);
    }

    public ArrayList<Student> getGraduatedStudents() {
        ArrayList<Student> promovati = new ArrayList<Student>();
        HashMap<Student,Grade> situatie = super.gettAllStudentGrades();
        for(Map.Entry<Student,Grade> entry : situatie.entrySet()){
            if(entry.getValue().getPartialScore() >= 3 && entry.getValue().getExamScore() >=2)
                promovati.add(entry.getKey());
        }
        return promovati;
    }
}
