
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements Action {
    // set global
    JFrame jf;
    JLabel displayLabel;
    JButton sevenbutton;
    JButton eightButton;
    JButton plusButton;
    JButton minusButton;
    JButton mulButton;
    JButton divButton;
    JButton equalButton;
    JButton zeroButton;
    JButton dotbutton;
    JButton threthButton;
    JButton towButton;
    JButton onebutton;
    JButton sixthButton;
    JButton fourbutton;
    JButton fiveButton;
    JButton ninethButton;

    // Create c constructor for calculator
    public Calculator() {
        // Create a object for Jfreame
        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(300, 150);
        // create object for JLabel class
        displayLabel = new JLabel("hello");

        // Create disply window
        displayLabel.setBounds(30, 50, 450, 40);
        jf.setVisible(true);
        jf.add(displayLabel);
        // create buttons

        sevenbutton = new JButton("7");
        sevenbutton.setBounds(30, 130, 80, 80);
        sevenbutton.addActionListener(this);
        sevenbutton.setFont(new Font("Arial", Font.BOLD, 40));
        jf.add(sevenbutton);

        eightButton = new JButton("8");
        eightButton.setBounds(130, 130, 80, 80);
        eightButton.addActionListener(this);
        eightButton.setFont(new Font("Arial", Font.BOLD, 40));
        jf.add(eightButton);

        ninethButton = new JButton("9");
        ninethButton.setBounds(230, 130, 80, 80);
        ninethButton.setFont(new Font("Arial", Font.BOLD, 40));
        jf.add(ninethButton);

        fourbutton = new JButton("4");
        fourbutton.setBounds(30, 230, 80, 80);
        fourbutton.setFont(new Font("Arial", Font.BOLD, 40));
        jf.add(fourbutton);

        fiveButton = new JButton("5");
        fiveButton.setBounds(130, 230, 80, 80);
        fiveButton.setFont(new Font("Arial", Font.BOLD, 40));
        jf.add(fiveButton);

        sixthButton = new JButton("6");
        sixthButton.setBounds(230, 230, 80, 80);
        sixthButton.setFont(new Font("Arial", Font.BOLD, 40));
        jf.add(sixthButton);

        onebutton = new JButton("1");
        onebutton.setBounds(30, 330, 80, 80);
        onebutton.setFont(new Font("Arial", Font.BOLD, 40));
        jf.add(onebutton);

        towButton = new JButton("2");
        towButton.setBounds(130, 330, 80, 80);
        towButton.setFont(new Font("Arial", Font.BOLD, 40));
        jf.add(towButton);

        threthButton = new JButton("3");
        threthButton.setBounds(230, 330, 80, 80);
        threthButton.setFont(new Font("Arial", Font.BOLD, 40));
        jf.add(threthButton);

        dotbutton = new JButton(".");
        dotbutton.setBounds(30, 430, 80, 80);
        dotbutton.setFont(new Font("Arial", Font.BOLD, 40));
        jf.add(dotbutton);

        zeroButton = new JButton("0");
        zeroButton.setBounds(130, 430, 80, 80);
        zeroButton.setFont(new Font("Arial", Font.BOLD, 40));
        jf.add(zeroButton);

        equalButton = new JButton("=");
        equalButton.setBounds(230, 430, 80, 80);
        equalButton.setFont(new Font("Arial", Font.BOLD, 40));
        jf.add(equalButton);

        divButton = new JButton("/");
        divButton.setBounds(330, 130, 80, 80);
        divButton.setFont(new Font("Arial", Font.BOLD, 40));
        jf.add(divButton);

        mulButton = new JButton("x");
        mulButton.setBounds(330, 230, 80, 80);
        mulButton.setFont(new Font("Arial", Font.BOLD, 40));
        jf.add(mulButton);

        minusButton = new JButton("-");
        minusButton.setBounds(330, 330, 80, 80);
        minusButton.setFont(new Font("Arial", Font.BOLD, 40));
        jf.add(minusButton);

        plusButton = new JButton("+");
        plusButton.setBounds(330, 430, 80, 80);
        plusButton.setFont(new Font("Arial", Font.BOLD, 40));
        jf.add(plusButton);

        displayLabel.setBackground(Color.GRAY);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.WHITE);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        // Create a object for calculator
        Calculator p = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // jf.getContentPane().setBackground(Color.gray);
        if (e.getSource() == sevenbutton) {
            displayLabel.setText("7");
        } else if (e.getSource() == eightButton) {
            displayLabel.setText("8");
        } else if (e.getSource() == ninethButton) {
            displayLabel.setText("9");
        } else if (e.getSource() == sixthButton) {
            displayLabel.setText("6");

        } else if (e.getSource() == fiveButton) {
            displayLabel.setText("6");
        } else if (e.getSource() == fourbutton) {
            displayLabel.setText("4");

        } else if (e.getSource() == threthButton) {

            displayLabel.setText("3");
        } else if (e.getSource() == towButton) {
            displayLabel.setText("2");
        } else if (e.getSource() == onebutton) {
            displayLabel.setText("1");

        } else if (e.getSource() == zeroButton)
            displayLabel.setText("0");

    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        // TODO Auto-generated method stub

    }

    @Override
    public Object getValue(String key) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void putValue(String arg0, Object arg1) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setEnabled(boolean b) {
        // TODO Auto-generated method stub

    }

}