package Lab1;

public class Prob5 {
    public int putere(int baza, int exp){
        if (exp==1)
            return baza;
        return baza * putere(baza, exp-1);

    }
    public void print(int rezultat){
        System.out.println(rezultat);
    }

    public static void main(String[] args) {
        int baza=3;
        int exp=7;
        Prob5 obiect = new Prob5();
        obiect.print(obiect.putere(baza, exp));
        System.out.println((int)Math.pow(baza,exp));

    }
}
