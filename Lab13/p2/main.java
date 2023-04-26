package Lab13.p2;

import java.io.*;

public class main {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("test01.in");
        LineNumberReader lnr = new LineNumberReader(fr);

        String line = lnr.readLine();
        while(line != null){
            int index = lnr.getLineNumber();
            if(index % 2 != 0){
                System.out.println(index + ". " + line);
            }
            line = lnr.readLine();
        }
        lnr.close();
    }
}
