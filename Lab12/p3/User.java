package Lab12.p3;

public class User implements Observer{
    String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void update(String notification) {
        System.out.println(name + " " + notification);
    }
}
