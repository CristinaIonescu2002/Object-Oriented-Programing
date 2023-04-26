package Lab4.pb4;

import java.util.Vector;

public class Teacher extends Person{
    Vector<String> courses;

    public Teacher(String name, String address) {
        super(name, address);
        this.courses = new Vector<>();
    }

    public String toString(){
        return getName()+ " "+ getAddress() ;
    }
    public boolean addCourse(String course){
        if(this.courses!=null && this.courses.size()==0){
            this.courses.add(course);
            return true;
        }else{
            for(int i=0; i<this.courses.size(); i++){
                if(this.courses.get(i).equals(course)){
                    return false;
                }
            }
            this.courses.add(course);
        }
        return true;
    }

    public boolean removeCourse(String course){
        int max= courses.size();
        if(max==0){
            return false;
        }else{
            for(int i=0; i<max; i++){
                if(this.courses.get(i).equals(course)){
                    this.courses.remove(course);
                    return true;
                }
            }
        }
        return false;
    }
}
