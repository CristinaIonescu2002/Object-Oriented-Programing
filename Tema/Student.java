package Tema;

import java.util.ArrayList;
import java.util.List;

public class Student extends User implements Subject, Comparable<Student>{
    private Parent mother;
    private Parent father;

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Grade grade) {
        for(Observer o : observers){
            Notification notif = new Notification(" Nota noua! ( " + grade + " )");
            o.update(notif);
        }
    }

    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void setMother(Parent mother) {
        this.mother = mother;
        this.addObserver(this.mother);
    }

    public void setFather(Parent father) {
        this.father = father;
        this.addObserver(this.father);
    }

    public Parent getMother() {
        return mother;
    }

    public Parent getFather() {
        return father;
    }

    public String toString() {
        return "Student: " + super.toString() ;
    }

    @Override
    public int compareTo(Student o) {
        if(this.getFirstName().equals(o.getFirstName()))
            return this.getLastName().compareTo(o.getLastName());
        return this.getFirstName().compareTo(o.getFirstName());
    }
}
