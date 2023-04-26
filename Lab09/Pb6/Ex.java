package Lab9.Pb6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

//D:\1.Facultate\SDA\lab03.c

public class Ex extends JFrame implements ActionListener {

    Label label;
    JTextField text;
    JButton button;
    JScrollPane sp;
    JTextArea result;

    public Ex() {
        super("Problema6");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(500,150));
        setSize(500,150);
        setMaximumSize(new Dimension(500,150));

        label = new Label("Calea");

        text = new JTextField(50);
        text.setEditable(true);

        button = new JButton("Afiseaza");
        button.setEnabled(true);
        button.addActionListener(this);

        result = new JTextArea("");
        sp = new JScrollPane(result);
        result.setVisible(true);

        JPanel p = new JPanel();
        p.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;

        p.add(text,c);

        c.gridx = 1;
        p.add(button,c);

        c.gridx = 0;
        c.gridy = 1;
        c.ipady = 50;
        p.add(sp,c);

        add(label, BorderLayout.NORTH);
        add(p, BorderLayout.CENTER);

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {

            String path = text.getText();

            File f = new File(path);
            if (f.exists() && !f.isDirectory()) {

                String res = "", line;

                try {
                    RandomAccessFile br = new RandomAccessFile(f,"r");
                    do {
                        line = br.readLine();
                        res += line + "\n";
                    } while (line != null);
                } catch (IOException ex) {
                    System.err.println("Exceptie");
                }

                result.setText(res);
                System.out.println(res);
                result.setVisible(true);

            }
            else {
                System.out.println("no");
                text.setText("");
                result.setVisible(false);
            }

        }
    }

    public static void main(String[] args) {
        Ex pb6 = new Ex();
        System.out.println(System.getProperty("user.dir"));
    }
}

