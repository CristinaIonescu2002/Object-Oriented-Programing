package Lab2;

import java.util.StringTokenizer;

public class Pb2 {
    public int aparitii_1(String s1, String s2){
        int ct=0;
        String[] cuvinte = s2.split(" ");
        for(int i=0; i<cuvinte.length; i++){
            if(cuvinte[i].equals(s1)){
                ct++;
            }
        }
        return ct;
    }

    public int aparitii_2(String s1, String s2){
        int ct=0;
        StringTokenizer cuvinte = new StringTokenizer(s2, ":,.-? \n");
        while(cuvinte.hasMoreTokens()){
            if(cuvinte.nextToken().equals(s1))
                ct++;
        }
        return ct;
    }

    public static void main(String[] args) {
        String s1="si";
        String s2="sir1 si cu sir2 fac un sir3";

        Pb2 obiect=new Pb2();
        System.out.println("Prima varianta:");
        System.out.println(obiect.aparitii_1(s1, s2));


        System.out.println("A doua varianta");
        System.out.println(obiect.aparitii_2(s1, s2));

    }
}
