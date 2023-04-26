package Lab2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Vector;

public class Pb4 {

    public Vector reuniune(Vector v1, Vector v2, int size1, int size2){
        int a=0, b=0;
        Vector v3=new Vector();
        int nr2= (int)v2.get(0);

        while(a<size1){
            int nr1= (int)v1.get(a);
            if(nr1>=nr2)
                break;
            v3.add(nr1);
            a++;
        }
        while(b<size2){
            nr2= (int)v2.get(b);
            v3.add(nr2);
            b++;
        }
        return v3;

    }

    public Vector intersectie(Vector v1, Vector v2,int size1, int size2){
        Vector v3=new Vector();

        for(int a=0; a<size1; a++){
            int nr1=(int)v1.get(a);
            for(int b=0; b<size2; b++){
                int nr2=(int)v2.get(b);
                if(nr1==nr2){
                    v3.add(nr1);
                    break;
                }
            }
        }
        return v3;
    }

    public Vector diferenta(Vector rezultat, Vector rezultat2,int size1, int size2){
        Vector v3=new Vector();

        for(int a=0; a<size1; a++){
            int nr1=(int)rezultat.get(a);
            boolean ok=true;

            for(int b=0; b<size2; b++){
                int nr2=(int)rezultat2.get(b);
                if(nr1==nr2) {
                    ok = false;
                    break;
                }
            }
            if(ok==true)
                v3.add(nr1);
        }


        return v3;
    }

    public static void main(String[] args) {
        Vector v1=new Vector();
        Vector v2=new Vector();

        for(int i=0; i<10; i++){
            v1.add(i);
            System.out.print(v1.get(i)+" ");
        }
        System.out.println();

        for(int i=8; i<18; i++)
            v2.add(i);
        for(int i=0; i<10; i++)
            System.out.print(v2.get(i)+" ");
        System.out.println();

        Collections.sort(v1);
        Collections.sort(v2);

        Pb4 obiect=new Pb4();
        Vector rezultat=obiect.reuniune(v1, v2, v1.size(), v2.size());
        for(int i=0; i<rezultat.size(); i++)
            System.out.print(rezultat.get(i)+" ");
        System.out.println();

        Vector rezultat2=obiect.intersectie(v1, v2, v1.size(), v2.size());
        for(int i=0; i<rezultat2.size(); i++)
            System.out.print(rezultat2.get(i)+" ");
        System.out.println();

        Vector rezultat3=obiect.diferenta(rezultat, rezultat2, rezultat.size(), rezultat2.size());
        for(int i=0; i<rezultat3.size(); i++)
            System.out.print(rezultat3.get(i)+" ");
        System.out.println();


    }
}
