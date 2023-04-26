package Lab3.prob1;

public class Fractie {
    int numarator, numitor;

    public Fractie(int numarator, int numitor) {
        this.numarator = numarator;
        this.numitor = numitor;
    }

    public Fractie() {
        this(0,0);
    }

    public Fractie adunare( Fractie c){
        return new Fractie(numarator+c.numarator,numitor+c.numitor);
    }

    public String toString(){
        return numarator + "/" +  numitor;
    }

    public boolean equals(Object c){
        if(c == null)
            return false;
        if(!(c instanceof Fractie))
            return false;
        Fractie fractie=(Fractie) c;
        return (fractie.numarator==numarator && fractie.numitor==numitor);
    }

    public static void main(String[] args) {

        Fractie f1 = new Fractie(1,2);
        Fractie f2 = new Fractie(3,5);
        Fractie f3 = new Fractie(3,5);
        System.out.println(f1);

        Fractie suma = f1.adunare(f2);
        System.out.println(suma);

        System.out.println(f1.equals(f2));
        System.out.println(f2.equals(f3));


    }
}
