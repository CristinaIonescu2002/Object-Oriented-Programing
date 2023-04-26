//package Lab11.p2;
//
//import javax.swing.*;
//import java.awt.*;
//
//public class Ex extends JFrame {
//    static JList list;
//    static JLabel label;
//
//    public Ex(){
//        setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
//        setSize(400,100);
//        DefaultListModel <Book> vect = new DefaultListModel<>();
//
//        vect.addElement(new Book("carte1", "blaaaa", " " ));
//        vect.addElement(new Book("carte2", "blaaaa", " " ));
//        vect.addElement(new Book("carte3", "blaaaa", " " ));
//        vect.addElement(new Book("carte4", "blaaaa", " " ));
//        vect.addElement(new Book("carte5", "blaaaa", " " ));
//        vect.addElement(new Book("carte6", "blaaaa", " " ));
//
////        vect.add(new Book("carte1", "blaaaa", " " ));
////        vect.add(new Book("carte2", "blaaaa", " " ));
////        vect.add(new Book("carte3", "blaaaa", " " ));
////        vect.add(new Book("carte4", "blaaaa", " " ));
////        vect.add(new Book("carte5", "blaaaa", " " ));
////        vect.add(new Book("carte6", "blaaaa", " " ));
////        vect.add(new Book("carte7", "blaaaa", " " ));
//
////        JPanel total = new JPanel();
////        JPanel panel1 = new JPanel();
////        JPanel panel2 = new JPanel();
//
//        setLayout(new GridLayout(1,2));
//        JList list = new JList(vect);
//        JScrollPane scrollPane = new JScrollPane(list);
//        scrollPane.setPreferredSize(new Dimension(200, 80));
//
//        JButton but = new JButton();
//        but.setLayout(new FlowLayout(FlowLayout.CENTER));
//
//
////        panel1.add(list);
//
////        total.add(panel1);
////        total.add(panel2);
//        add(scrollPane, BorderLayout.CENTER);
//        add(but);
//        setVisible(true);
//        }
//
//    public static void main(String[] args) {
//        Ex ex = new Ex();
//    }
//}
