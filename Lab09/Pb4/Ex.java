package Lab9.Pb4;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Ex extends JFrame implements ChangeListener {

    JTextField text, red, green, blue;

    JSlider s1, s2, s3;

    public Ex() {
        super("Problema 4");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        text = new JTextField(30);
        text.setEditable(true);
        text.setText("Colored text");

        red = new JTextField(7);
        red.setText("RED");
        red.setEditable(false);

        green = new JTextField(7);
        green.setText("GREEN");
        green.setEditable(false);

        blue = new JTextField(7);
        blue.setText("BLUE");
        blue.setEditable(false);

        s1 = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        s2 = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        s3 = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);

        JPanel sp = new JPanel();
        sp.setLayout(new GridLayout(3,2));
        sp.add(red);
        sp.add(s1);
        sp.add(green);
        sp.add(s2);
        sp.add(blue);
        sp.add(s3);

        add(text, BorderLayout.NORTH);
        add(sp,BorderLayout.CENTER);

        s1.addChangeListener(this);
        s2.addChangeListener(this);
        s3.addChangeListener(this);

        pack();
        setVisible(true);

    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        if (changeEvent.getSource() instanceof JSlider) {
            text.setForeground(new Color(s1.getValue(),s2.getValue(),s3.getValue()));
        }
    }

    public static void main(String[] args) {
        Ex pb4 = new Ex();
    }
}

