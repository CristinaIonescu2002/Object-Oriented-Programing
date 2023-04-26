package Lab4.pb4;

import java.util.Vector;

public class Student extends Person{
    Vector<String> courses;
    Vector<Integer> grades;

    public Student(String name, String address) {
        super(name, address);
        this.courses=new Vector<>();
        this.grades=new Vector<>();
    }

    public String toString(){
        return getName()+" "+getAddress();
    }

    public void addCourseGrade(String course, int grade){
        if(this.courses!=null && this.courses.size()==0){
            this.courses.add(course);
            this.grades.add(grade);
        }else{
            for(int i=0; i<this.courses.size(); i++){
                if(this.courses.get(i).equals(course)){
                    return;
                }
            }
            this.courses.add(course);
            this.grades.add(grade);
        }
    }

    public void printGrades(){
        if(grades==null){
            System.out.println("nu are note");
        }else{
            for(int i=0; i<grades.size(); i++){
                System.out.print(grades.get(i)+" ");
            }
            System.out.println();
        }
    }

    public double getAverageGrade(){
        double medie=0;
        if(grades==null){
            return 0;
        }else{
            for(int i=0; i<grades.size(); i++){
                medie+=(int)grades.get(i);
            }
            medie= medie/grades.size();
            return medie;
        }
    }
}