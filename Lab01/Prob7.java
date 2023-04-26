package Lab1;

public class Prob7 {

    public boolean prim(Integer nr){
        if (nr < 2)
            return true;
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
        int n = 20;
        Integer a;
        Integer b;
        Integer c;
        for (a = 2; a <= n; a=a+2) {
            for(b = 1; b <= n; b++){
                Prob7 obiect= new Prob7();
                if(b<a && obiect.prim(b)==true){
                    for(c = 1; c <= n; c++){
                        if(b+c==a && obiect.prim(b)==true){
                            System.out.println(a + " = " + b + " + " + c);
                        }else if (b+c>a){
                            break;
                        }
                    }
                }else break;
            }
        }
    }
}
