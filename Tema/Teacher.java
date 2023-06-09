package Tema;

public class Teacher extends User implements Element{


    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public String toString() {
        return super.toString();
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
