package Lab2;

public class Pb1 {
    public static void main(String[] args) {
        String s1="si";
        String s="sir1 si cu sir2 fac un sir3";

        int ct=0;
        int pos=s.indexOf(s1, 0);

        while (pos!=-1){
            ct++;
            pos=s.indexOf(s1, pos+1);
        }
        System.out.println(ct);


    }
}
