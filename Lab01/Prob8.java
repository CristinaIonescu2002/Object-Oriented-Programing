package Lab1;


import java.util.Arrays;
import java.util.Random;

public class Prob8 {
    public double[] ordonare(double[] vector) {
        Arrays.sort(vector);
        return vector;
    }

    public static boolean binarySearch(double[] vector, double key) {
        if (Arrays.binarySearch(vector, key) > 0 && Arrays.binarySearch(vector, key)< vector.length)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Random generator = new Random();
        double[] vector = new double[10];

        for (int i = 0; i < 10; i++) {
            double nr = generator.nextInt(10);
            vector[i] = nr;
        }
        for (int i = 0; i < 10; i++)
            System.out.print(vector[i] + " ");
        System.out.println();

        Prob8 obiect = new Prob8();
        obiect.ordonare(vector);
        for (int i = 0; i < 10; i++)
            System.out.print(vector[i] + " ");
        System.out.println();

        double key = 2;
        System.out.println(key + " " + binarySearch(vector, key));


    }
}
