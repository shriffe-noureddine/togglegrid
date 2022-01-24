package com.company;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButton extends JButton implements ActionListener {
    public MyButton() {
        // ADD CODE HERE
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // ADD CODE HERE
        if (this.getText().equals("*")) {
            this.setText(" ");
        } else {
            this.setText("*");
        }
    }
}
