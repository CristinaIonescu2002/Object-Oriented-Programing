package Lab5.p2;

import java.util.Vector;

public class Graph extends MyList {
    Vector vector;

    public Graph(int noduri) {
        vector = new Vector<>();
        for (int i = 0; i <= noduri; i++) {
            MyList lista = new MyList();
            this.add(lista);

        }
    }

    void add(int x, int y) {
        MyList listuta = (MyList) this.get(x);
        listuta.add(y);
    }

    void dfs(int start) {
        System.out.print(start + " ");
        vector.add(start);
        MyList adiacenta = (MyList) get(start);
        for (int i = 0; i < adiacenta.size(); i++) {
            int vecinul = (int) adiacenta.get(i);
            if (!vector.contains(vecinul)) {
                dfs(vecinul);
            }
        }
    }

    public String toString() {
        String rezultat = "";
        for (int i = 0; i < size(); i++) {
            rezultat += i + ": " + get(i) + "\n";
        }
        return rezultat;
    }

}
