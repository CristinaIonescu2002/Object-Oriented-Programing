package Lab7.Pb1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public TreeSet printWords(String cuv) throws FileNotFoundException {
        File file = new File(cuv);
        Scanner input = new Scanner(file);

        TreeSet tree = new TreeSet();

        while(input.hasNext()){
            String word = input.next();
            if(!tree.contains(word))
                tree.add(word);
        }

        return tree;
    }

    public TreeSet printWordsComparator(TreeSet ts){


        TreeSet tree = new TreeSet(new Comparator() {
                            public int compare(Object o1, Object o2) {
                                String s1=(String) o1;
                                String s2=(String) o2;
                                return -s1.compareTo(s2);
                            }
                        });
        tree.addAll(ts);
        return tree;

    }

    public static void main(String[] args) throws FileNotFoundException {

        Main obiect = new Main();

        TreeSet tree1=obiect.printWords("test01.txt");

        System.out.println(tree1);

        TreeSet tree2=obiect.printWordsComparator(tree1);
        System.out.println(tree2);
    }
}
