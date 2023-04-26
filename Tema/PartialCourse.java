package Tema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PartialCourse extends Course{

    static class PartialCoursebuilder extends CourseBuilder{
        public PartialCoursebuilder(String name) {
            super(name);
        }

        public Course build(){
            return new PartialCourse(this);
        }
    }

    public PartialCourse(CourseBuilder builder) {
        super(builder);
    }

    public ArrayList<Student> getGraduatedStudents() {
        ArrayList<Student> promovati = new ArrayList<Student>();
        HashMap<Student,Grade> situatie = super.gettAllStudentGrades();
        for(Map.Entry<Student,Grade> entry : situatie.entrySet()){
            if(entry.getValue().getTotal() >= 5)
                promovati.add(entry.getKey());
        }
        return promovati;
    }
}
