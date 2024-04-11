package MachineProblem4;

/*
AMAOEd MIS6232 Computer Programming 2 (Java)

Author: J. E. Cunanan
Student No: 2022-0072254

Machine Problem 4
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalcMain extends JFrame implements ActionListener{
    private JTextField firstNumber;
    private JTextField secondNumber;
    private JTextField result;

    public CalcMain() {
        setTitle("Calculator");
        setSize(400,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display
        firstNumber = new JTextField(10);
        secondNumber = new JTextField(10);
        result = new JTextField(10);
        result.setEditable(false);

        // Buttons
        JButton addButton = new JButton("ADD");
        JButton subtractButton = new JButton("SUBTRACT");
        JButton multiplyButton = new JButton("MULTIPLY");
        JButton divideButton = new JButton("DIVIDE");
        JButton resetButton = new JButton("RESET");
        JButton exitButton = new JButton("EXIT");

        // Button Listeners
        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);
        resetButton.addActionListener(this);
        exitButton.addActionListener(this);
    }

}
