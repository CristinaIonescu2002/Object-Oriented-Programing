package Tema;

public class Notification {
    private final String notificare;

    public Notification(String notificare) {
        this.notificare = notificare;
    }

    public String getNotificare() {
        return notificare;
    }

    public String toString() {
        return "Puteti vedea o " + notificare;
    }
}
