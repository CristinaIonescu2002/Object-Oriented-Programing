package Tema;

public class Grade implements Comparable<Grade>, Cloneable{
    private Double partialScore = 0.0, examScore = 0.0;
    private Student student;
    private String course;

    public Grade(Student student, String course) {
        this.student = student;
        this.course = course;
    }

    public Object clone() throws CloneNotSupportedException{
        Grade clone = (Grade) super.clone();
        clone.partialScore = this.partialScore;
        clone.examScore = this.examScore;
        clone.student = this.student;
        clone.course = this.course;
        return clone;
    }

    public void setPartialScore(Double partialScore) {
        this.partialScore = partialScore;
    }

    public void setExamScore(Double examScore) {
        this.examScore = examScore;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Double getPartialScore() {
        return partialScore;
    }

    public Double getExamScore() {
        return examScore;
    }

    public Student getStudent() {
        return student;
    }

    public String getCourse() {
        return course;
    }

    public int compareTo(Grade g) {
        if(g.getTotal() < this.getTotal())
            return -1;
        else if(g.getTotal().equals(this.getTotal()))
            return 0;
        else
            return -1;
    }

    public Double getTotal(){
        return partialScore + examScore;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "partialScore=" + partialScore +
                ", examScore=" + examScore +
                ", course='" + course + '\'' +
                '}';
    }
}
