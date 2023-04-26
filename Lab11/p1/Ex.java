package Lab11.p1;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class Ex extends JFrame {
    static JList list;
    static JLabel label;

    public Ex(){
        setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        setSize(400,100);
        Vector <Book> vect = new Vector<Book>();
        vect.add(new Book("carte1", "blaaaa", " " ));
        vect.add(new Book("carte2", "blaaaa", " " ));
        vect.add(new Book("carte3", "blaaaa", " " ));
        vect.add(new Book("carte4", "blaaaa", " " ));
        vect.add(new Book("carte5", "blaaaa", " " ));
        vect.add(new Book("carte6", "blaaaa", " " ));
        vect.add(new Book("carte7", "blaaaa", " " ));

        JList list = new JList(vect);
        JScrollPane scrollPane = new JScrollPane(list);
        scrollPane.setPreferredSize(new Dimension(200, 80));

        add(scrollPane, BorderLayout.CENTER);
        setVisible(true);
        }

    public static void main(String[] args) {
        Ex ex = new Ex();
    }
}
