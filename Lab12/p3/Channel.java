package Lab12.p3;

import java.util.ArrayList;

public class Channel implements Subject{
    ArrayList<User> abonati = new ArrayList<>();
    String name;

    public Channel(String name) {
        this.name = name;
    }

    public void subescribe(User user){
        abonati.add(user);
    }

    public void unsubscribe(User user){
        abonati.remove(abonati.indexOf(user));
    }
    public void notify(String notification){
        for(User abonat : abonati){
            abonat.update(notification);
        }
    }

    public void afisareAbonati(){
        for(User u : abonati){
            System.out.println(u.getName());
        }
    }
}
