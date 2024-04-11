package Lab011;

/*
AMAOEd MIS6232 Computer Programming 2 (Java)

Author: J. E. Cunanan
Student No: 2022-0072254

Laboratory Exercise 011
*/

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class SwingExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        Container pane = frame.getContentPane();

        JButton button = new JButton("Button 3");
        pane.add(button, BorderLayout.PAGE_START);

        button = new JButton("Button 2");
        button.setPreferredSize(new Dimension(200, 100));
        pane.add(button, BorderLayout.CENTER);

        button = new JButton("Button 3");
        pane.add(button, BorderLayout.LINE_START);

        button = new JButton("Button 4");
        pane.add(button, BorderLayout.PAGE_END);

        button = new JButton("Button 5");
        pane.add(button, BorderLayout.LINE_END);

        // Question 2 (Frame Settings)
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Question 9 (Mouse listener)
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                // insert code here
            }
        });

        // Question 10
        JTextArea textArea = new JTextArea(20,20);

    }
}
