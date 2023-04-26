package Lab3.prob7;

public class Train {
    Route r;
    Schedule s;
    boolean local;

    public Train() {
        r = null;
        s = null;
    }

    public Train(boolean local, Route r, Schedule s) {
        this.r = r;
        this.s = s;
        this.local = local;
    }

    public int costBilet(int x) {
        return x * s.comparare();
    }

    public String toString() {
        String rezult = "";
        rezult += local + " ";
        rezult += r.getOrigin();
        rezult += " (" + s.departure.getHour() + ":" + s.departure.getMinute() + ") -> ";
        rezult += r.getDestination();
        rezult += " (" + s.arrival.getHour() + ":";
        if (s.arrival.getMinute() < 10)
            rezult += "0" + s.arrival.getMinute() + ")";
        else
            rezult += +s.arrival.getMinute() + ")";

        return rezult;
    }
}
