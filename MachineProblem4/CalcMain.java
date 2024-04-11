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
    private JTextField firstNumberField;
    private JTextField secondNumberField;
    private JTextField resultField;

    public CalcMain() {
        setTitle("Calculator");
        setSize(400,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display
        firstNumberField = new JTextField(10);
        secondNumberField = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false);

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

        // Button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(divideButton);
        buttonPanel.add(resetButton);
        buttonPanel.add(exitButton);

        // Input panel
        JPanel inputPanel = new JPanel(new GridLayout(3, 2));
        inputPanel.add(new JLabel("First Number: "));
        inputPanel.add(firstNumberField);
        inputPanel.add(new JLabel("Second Number: "));
        inputPanel.add(secondNumberField);
        inputPanel.add(new JLabel("Result: "));
        inputPanel.add(resultField);

        // Panels to frame
        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("RESET")) {
            firstNumberField.setText("");
            secondNumberField.setText("");
            resultField.setText("");
        } else if (e.getActionCommand().equals("QUIT")) {
            int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to quit?",
                    "Quit", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        } else {
            double firstNumber = Double.parseDouble(firstNumberField.getText());
            double secondNumber = Double.parseDouble(secondNumberField.getText());
            double result = 0;

            // Arithmetic
            if (e.getActionCommand().equals("ADD")) {
                result = firstNumber + secondNumber;
            } else if (e.getActionCommand().equals("SUBTRACT")) {
                result = firstNumber - secondNumber;
            } else if (e.getActionCommand().equals("MULTIPLY")) {
                result = firstNumber * secondNumber;
            } else if (e.getActionCommand().equals("DIVIDE")) {
                result = firstNumber / secondNumber;
            }

            // Update result
            resultField.setText(Double.toString(result));
        }
    }

}
