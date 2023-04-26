package Lab2;

import java.util.StringTokenizer;

public class Pb5 {

    public String cenzurare (String text, String[] cuvinte){
        int ok=0;
        for(int i=0; i< cuvinte.length; i++){
            if(text.contains(cuvinte[i]))
                ok=1;
        }
        if ( ok == 0){
            System.out.println("Nimic suspect");
            return text;
        }
        System.out.println("Text suspect");
        String rezultat="";
        StringTokenizer st = new StringTokenizer(text);
        boolean inceput=false;
        while(st.hasMoreTokens()){
            if(inceput==true)
                rezultat+=" ";
            inceput=true;
            int contine=0;
            String cuvant = st.nextToken();
            for(int i=0; i< cuvinte.length; i++){
                if(cuvant.contains(cuvinte[i])){
                    contine=1;
                    break;
                }
            }
            if(contine==0)
                rezultat+=cuvant;
            else{
                rezultat+=cuvant.charAt(0);
                for(int i=1; i<cuvant.length()-1; i++)
                    rezultat+="*";
                rezultat+=cuvant.charAt(cuvant.length()-1);
            }
        }
        return rezultat;
    }

    public static void main(String[] args) {
        String text = "Un terorist avea o bomba";
        String cuvinte[] = new String[2];
        cuvinte[0] = "terorist";
        cuvinte[1] = "bomba";
        Pb5 prb5 = new Pb5();
        String rezultat;
        rezultat = prb5.cenzurare(text, cuvinte);
        System.out.println(rezultat);
    }
}
