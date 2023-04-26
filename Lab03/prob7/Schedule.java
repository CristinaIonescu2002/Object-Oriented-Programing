package Lab3.prob7;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Schedule{
    ClockTime departure;
    ClockTime arrival;

    public Schedule(ClockTime d, ClockTime a) {
        this.departure = d;
        this.arrival = a;
    }
    public int comparare(){
        LocalTime one = LocalTime.of(departure.getHour(), departure.getMinute());
        LocalTime two = LocalTime.of(arrival.getHour(), arrival.getMinute());

        return (int) ChronoUnit.MINUTES.between(one, two);
    }
    //metoda durata calatoriei
}
