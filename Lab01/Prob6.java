package Lab1;

public class Prob6 {
    public boolean prim(int nr){
        if (nr < 2)
            return false;
        else{
            int d;
            for( d=2; d*d<= nr; d++ ){
                if (nr%d == 0)
                    return false;
            }
            return true;
        }

    }

    public static void main(String[] args) {
        Prob6 obiect = new Prob6();
        for(int i=1; i<=20; i++){
            if(obiect.prim(i) == false)
                System.out.println(i + " --> Nu este prim!");
            else System.out.println(i + " --> Este prim!");
        }
    }
}
