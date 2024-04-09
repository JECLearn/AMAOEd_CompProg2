package SwingFrame;

/*
AMAOEd MIS6232 Computer Programming 2 (Java)

Author: J. E. Cunanan
Student No: 2022-0072254

Swing API
https://amaoed.app.box.com/s/qmjplp63xw11ex8u6wruxkmz41l1jfw2
*/

import javax.swing.*;

public class MyFrame extends JFrame {
    // Declare components
    private JLabel lblName = new JLabel("Enter your name: ");
    private JTextField txtName = new JTextField();
    private JButton btnSubmit = new JButton("Submit");
    private JPanel panel = new JPanel();

    // Constructor
    public MyFrame() {
        // JFrame Methods
        super("My First Swing Frame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setLocation(150, 50);
        this.setVisible(true);

        // Define components
        lblName.setSize(150,20);
        lblName.setLocation(100,20);

        txtName.setSize(100,20);
        txtName.setLocation(200,20);

        btnSubmit.setSize(100,20);
        btnSubmit.setLocation(150, 80);

        // Define Panel
        this.panel.setLayout(null);
        this.setContentPane(panel);

        // Add components to the frame
        this.getContentPane().add(lblName);
        this.getContentPane().add(txtName);
        this.getContentPane().add(btnSubmit);
    }

}
