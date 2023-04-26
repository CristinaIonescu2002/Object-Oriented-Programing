package Lab13.p3;

import java.io.*;

public class main {
    public static void main(String[] args) {
        String text;
        try (BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new FileWriter("text.txt"))){
            System.out.println("Introduceti text:");

            while (!(text = keyboard.readLine()).equals("exit")) {
                writer.write(text);
                writer.newLine();
            }
            System.out.println("Saved");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
