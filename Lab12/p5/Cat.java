package Lab12.p5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cat implements Visitor{
    public void visit (Director f) {
        System.out.println("Not a file");
    }
    public void visit (Fisier f) {
        File myObj = new File(f.getName());
        Scanner myReader = null;
        try {
            myReader = new Scanner(myObj);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
    }
}
