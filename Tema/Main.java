package Tema;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Vector;

public class Main{
    JFrame mainFrame = new JFrame("Catalog");
    JFrame StudentFrame = new JFrame("Student Catalog");
    JFrame ParentFrame = new JFrame("Parent Catalog");
    JFrame TeacherFrame = new JFrame("Teacher Catalog");
    JFrame AssistantFrame = new JFrame("Assistant Catalog");

    Dimension dimCataloage = new Dimension(900,800);

    Student student = Catalog.getInstance().getCursuri().get(0).getAllStudents().get(6);
    Teacher prof = Catalog.getInstance().getCursuri().get(0).getProfesorTitular();

    public void creareMainFrame(){
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel meniuPrincipal = new JPanel();

        meniuPrincipal.setBorder(new EmptyBorder(200, 200, 200, 200));
        meniuPrincipal.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.NORTH;

        meniuPrincipal.add(new JLabel("<html><h2><i>Alegere tip user:</i></h2><hr></html>"), gbc);

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 200;
        gbc.ipady = 50;
        gbc.weighty = 20;

        JPanel buttons = new JPanel(new GridBagLayout());

        JButton buttonStudent = new JButton("Student");
        JButton buttonTeacher = new JButton("Teacher");
        JButton buttonAssistant = new JButton("Assistant");
        JButton buttonParent = new JButton("Parent");

        buttons.add(buttonStudent, gbc);
        buttons.add(buttonParent, gbc);
        buttons.add(buttonTeacher, gbc);
        buttons.add(buttonAssistant, gbc);

        meniuPrincipal.add(buttons, gbc);

        mainFrame.add(meniuPrincipal);
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);

        buttonStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentFrame.setSize(dimCataloage);
                StudentFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                StudentFrame.setVisible(true);
                mainFrame.dispatchEvent(new WindowEvent(StudentFrame, WindowEvent.WINDOW_CLOSING));

            }
        });
        buttonParent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ParentFrame.setSize(dimCataloage);
                ParentFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                ParentFrame.setVisible(true);
                mainFrame.dispatchEvent(new WindowEvent(ParentFrame, WindowEvent.WINDOW_CLOSING));
            }
        });
        buttonTeacher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TeacherFrame.setSize(dimCataloage);
                TeacherFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                TeacherFrame.setVisible(true);
                mainFrame.dispatchEvent(new WindowEvent(TeacherFrame, WindowEvent.WINDOW_CLOSING));
            }
        });
        buttonAssistant.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AssistantFrame.setSize(dimCataloage);
                AssistantFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                AssistantFrame.setVisible(true);
                mainFrame.dispatchEvent(new WindowEvent(AssistantFrame, WindowEvent.WINDOW_CLOSING));
            }
        });
    }

    public void creareStudentFrame(){
        StudentFrame.setLayout(new BorderLayout());

        ArrayList<Course> c = Catalog.getInstance().getCursuri();
        Vector<String> cursuri = new Vector<>();
        for(Course curs : c){
            cursuri.add(curs.getName());
        }

        JList list = new JList(cursuri);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane scrollPane = new JScrollPane(list);
        scrollPane.setPreferredSize(new Dimension(200,100));

        JLabel titlu = new JLabel("<html><h2>Situatie scolara elev:    "
                + student.getFirstName() + " " + student.getLastName() +"</h2></html>");
        titlu.setBackground(Color.DARK_GRAY);
        titlu.setBorder(BorderFactory.createLineBorder(Color.black));
        titlu.setHorizontalAlignment(SwingConstants.CENTER);


        StudentFrame.add(scrollPane, BorderLayout.WEST);
        StudentFrame.add(titlu, BorderLayout.PAGE_START);


        //////buton inapoi
        JButton inapoi = new JButton("Inapoi");
        inapoi.setBackground(Color.gray);
        StudentFrame.add(inapoi, BorderLayout.LINE_END);
        inapoi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.setVisible(true);
                StudentFrame.dispatchEvent(new WindowEvent(mainFrame, WindowEvent.WINDOW_CLOSING));

            }
        });
        ///////
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(9,1));

        JLabel l1 = new JLabel();
        JLabel l2 = new JLabel();
        JLabel l3 = new JLabel();
        JLabel l4 = new JLabel();

        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String numeCurs = list.getSelectedValue().toString();
                l1.setText("<html><h1>Course name: <br>" + list.getSelectedValue().toString() + "</h1></html>");

                ArrayList<Course> listaCursuri = Catalog.getInstance().getCursuri();
                for(Course c : listaCursuri){
                    if(c.getName().equals(numeCurs)){
                        l2.setText("<html><h2>Teacher:<br></h2>" + c.getProfesorTitular() + "</h2></html>");
                        String textAsistenti = "<html><h3>Assistants:<br></h3>";
                        for(Assistant a : c.getTotiAsistentii()){
                            textAsistenti += a + "<br>";
                        }
                        textAsistenti += "</h3></html>";
                        l3.setText(textAsistenti);
                        if(c.getAllStudents().contains(student)){
                            Grade note = c.getGrade(student);
                            l4.setText("<html>    Notele:<br>Nota partial:   " + note.getPartialScore() + "<br>" +
                                    "Nota examen:   " + note.getExamScore() + "<br>Nota totala:   " + note.getTotal() +
                                    "<html>");
                        }else{
                            l4.setText("Acest elev nu apartine acestui curs!");
                        }
                    }
                }
            }
        });

        l1.setBounds(50,50, 100,30);
        l2.setBounds(50,50, 100,30);
        l3.setBounds(50,50, 100,30);
        l4.setBounds(50,50, 100,30);

        panel.add(l1);
        panel.add(l2);
        panel.add(l3);
        panel.add(l4);

        StudentFrame.add(panel, BorderLayout.CENTER);
    }

    public void creareParentFrame(){
        ParentFrame.setLayout(new BorderLayout());

        JLabel titlu = new JLabel("<html><h2>Parent:    "
                + student.getFirstName() + " " + student.getLastName() +"</h2></html>");
        titlu.setBackground(Color.DARK_GRAY);
        titlu.setBorder(BorderFactory.createLineBorder(Color.black));
        titlu.setHorizontalAlignment(SwingConstants.CENTER);
        ParentFrame.add(titlu, BorderLayout.PAGE_START);

        JButton inapoi = new JButton("Inapoi");
        inapoi.setBackground(Color.gray);
        ParentFrame.add(inapoi, BorderLayout.LINE_END);
        inapoi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.setVisible(true);
                ParentFrame.dispatchEvent(new WindowEvent(mainFrame, WindowEvent.WINDOW_CLOSING));

            }
        });

    }
    public void creareTeacherFrame(){
        TeacherFrame.setLayout(new BorderLayout());

        JLabel titlu = new JLabel("<html><h2>Teacher:    "
                + student.getFirstName() + " " + student.getLastName() +"</h2></html>");
        titlu.setBackground(Color.DARK_GRAY);
        titlu.setBorder(BorderFactory.createLineBorder(Color.black));
        titlu.setHorizontalAlignment(SwingConstants.CENTER);
        TeacherFrame.add(titlu, BorderLayout.PAGE_START);

        ArrayList<Course> c = Catalog.getInstance().getCursuri();
        Vector<String> cursuri = new Vector<>();
        for(Course curs : c){
            if(curs.getProfesorTitular().equals(prof)){
                for(Student s : curs.getAllStudents())
                     cursuri.add(s.getFirstName() + s.getLastName());
            }

        }

        JList list = new JList(cursuri);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane scrollPane = new JScrollPane(list);
        scrollPane.setPreferredSize(new Dimension(200,100));
        TeacherFrame.add(scrollPane, BorderLayout.WEST);


        JButton inapoi = new JButton("Inapoi");
        inapoi.setBackground(Color.gray);
        TeacherFrame.add(inapoi, BorderLayout.LINE_END);
        inapoi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.setVisible(true);
                TeacherFrame.dispatchEvent(new WindowEvent(mainFrame, WindowEvent.WINDOW_CLOSING));

            }
        });
    }
    public void creareAssistantFrame(){
        AssistantFrame.setLayout(new BorderLayout());

        JLabel titlu = new JLabel("<html><h2>Assistant:    "
                + student.getFirstName() + " " + student.getLastName() +"</h2></html>");
        titlu.setBackground(Color.DARK_GRAY);
        titlu.setBorder(BorderFactory.createLineBorder(Color.black));
        titlu.setHorizontalAlignment(SwingConstants.CENTER);
        AssistantFrame.add(titlu, BorderLayout.PAGE_START);

        JButton inapoi = new JButton("Inapoi");
        inapoi.setBackground(Color.gray);
        AssistantFrame.add(inapoi, BorderLayout.LINE_END);
        inapoi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.setVisible(true);
                AssistantFrame.dispatchEvent(new WindowEvent(mainFrame, WindowEvent.WINDOW_CLOSING));

            }
        });
    }


    public static void main(String[] args) {
        TestareSiAfisari obiect = new TestareSiAfisari();
        obiect.exempleRulare();

        Main o = new Main();
        o.creareMainFrame();
        o.creareStudentFrame();
        o.creareParentFrame();
        o.creareTeacherFrame();
        o.creareAssistantFrame();


    }
}
