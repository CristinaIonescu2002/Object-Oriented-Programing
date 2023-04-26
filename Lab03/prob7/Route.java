package Lab3.prob7;

public class Route{
    String origin;
    String destination;

    public Route(String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public boolean destinatie(Route r){
        return (this.origin.equals(r.destination) && this.destination.equals(r.origin));
    }
}
