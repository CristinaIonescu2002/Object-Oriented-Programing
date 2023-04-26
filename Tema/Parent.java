package Tema;

import java.util.ArrayList;

public class Parent extends User implements Observer{
    private final ArrayList<Notification> notificari;

    public Parent(String firstName, String lastName) {
        super(firstName, lastName);
        notificari = new ArrayList<>();
    }

    public String toString() {
        return "Parent: " + super.toString();
    }

    public ArrayList<Notification> getNotificari(){
        return notificari;
    }

    public void afisareNotificare(Notification notification){
        System.out.println(this + " --> " +  notification.toString());
    }

    public void notificareValidata(Notification notification){
        notificari.remove(notification);
    }

    public void update(Notification notification) {
        notificari.add(notification);
    }
}
