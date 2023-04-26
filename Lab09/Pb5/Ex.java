package Lab9.Pb5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Ex extends JFrame implements ActionListener {

    JTextField text;
    JButton button;

    Color[] colors = {Color.red, Color.black, Color.blue, Color.orange, Color.pink};
    int index = 0;

    public Ex() {
        super("Problema5");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(100,100);

        button = new JButton("Button Text");
        button.setEnabled(true);
        button.addActionListener(this);
        button.setMnemonic(KeyEvent.VK_C);
        button.setForeground(Color.black);

        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());

        add(button);

        pack();
        setVisible(true);


    }

    public void setForeground(int index) {
        button.setForeground(colors[index]);
    }

    public void setBackground(int index) {
        button.setBackground(colors[index]);
        button.setEnabled(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() instanceof JButton) {
            button.setEnabled(false);
            index++;

            if (index >= colors.length)
                index = 0;

            if (index < colors.length - 1) {
                setForeground(index);
                setBackground(index+1);
            }
            if (index == colors.length - 1) {
                setForeground(index);
                setBackground(0);
            }
        }
    }

    public static void main(String[] args) {
        Ex pb5 = new Ex();
    }

}
