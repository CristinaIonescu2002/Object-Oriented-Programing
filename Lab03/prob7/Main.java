package Lab3.prob7;

public class Main {
    public static void main(String[] args) {
        Train train1 = new Train(true, new Route("Bucuresti Nord", "Constanta"), new Schedule(new ClockTime(9,35), new ClockTime(12,2)));
        Train train2 = new Train(true, new Route("Bucuresti Nord", "Iasi"), new Schedule(new ClockTime(5,45), new ClockTime(12,49)));
        Train train3 = new Train(false, new Route("Bucuresti Nord", "Sofia"), new Schedule(new ClockTime(23,45), new ClockTime(17,0)));

        System.out.println(train1);
        System.out.println(train2);
        System.out.println(train3);

        System.out.println("Cost bilet: " + train1.costBilet(1) + " lei");

    }
}
