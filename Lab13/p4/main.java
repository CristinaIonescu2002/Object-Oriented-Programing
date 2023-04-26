package Lab13.p4;

import java.io.*;

public class main {
    public static void main(String[] args) throws IOException {
        FileReader in = new FileReader(new File("test02.in"));
        StreamTokenizer str = new StreamTokenizer(in);

        int nrCuvinte = 0;
        int curent = str.nextToken();

        while(curent != StreamTokenizer.TT_EOF){
            nrCuvinte++;
            curent = str.nextToken();
        }

        System.out.println(nrCuvinte);
    }
}
