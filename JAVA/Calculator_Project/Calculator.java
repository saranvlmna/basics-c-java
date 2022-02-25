
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.tree.TreeCellEditor;

public class Calculator {
    // Create c constructor for calculator
    public Calculator() {
        // Create a object for Jfreame
        JFrame jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(300, 150);
        // create object for JLabel class
        JLabel displayLabel = new JLabel("hello");
        // Create disply window
        displayLabel.setBounds(30, 50, 450, 40);
        jf.setVisible(true);
        jf.add(displayLabel);

        JButton sevenbutton = new JButton("7");
        sevenbutton.setBounds(30, 130, 80, 80);

        sevenbutton.setFont(new Font("Arial",Font.BOLD,40));
        jf.add(sevenbutton);

        JButton eightButton = new JButton("8");
        eightButton.setBounds(130, 130, 80, 80);
        jf.add(eightButton);

        JButton ninethButton = new JButton("9");
        ninethButton.setBounds(230, 130, 80, 80);
        jf.add(ninethButton);

        JButton fourbutton = new JButton("4");
        fourbutton.setBounds(30, 230, 80, 80);
        jf.add(fourbutton);

        JButton fiveButton = new JButton("5");
        fiveButton.setBounds(130, 230, 80, 80);
        jf.add(fiveButton);

        JButton sixthButton = new JButton("6");
        sixthButton.setBounds(230, 230, 80, 80);
        jf.add(sixthButton);

        JButton onebutton = new JButton("1");
        onebutton.setBounds(30, 330, 80, 80);
        jf.add(onebutton);

        JButton towButton = new JButton("2");
        towButton.setBounds(130, 330, 80, 80);
        jf.add(towButton);

        JButton threthButton = new JButton("3");
        threthButton.setBounds(230, 330, 80, 80);
        jf.add(threthButton);

        JButton dotbutton = new JButton(".");
        dotbutton.setBounds(30, 430, 80, 80);
        jf.add(dotbutton);

        JButton zeroButton = new JButton("0");
        zeroButton.setBounds(130, 430, 80, 80);
        jf.add(zeroButton);

        JButton equalButton = new JButton("=");
        equalButton.setBounds(230, 430, 80, 80);
        jf.add(equalButton);

        JButton divButton = new JButton("/");
        divButton.setBounds(330, 130, 80, 80);
        jf.add(divButton);

        JButton mulButton = new JButton("x");
        mulButton.setBounds(330, 230, 80, 80);
        jf.add(mulButton);

        JButton minusButton = new JButton("-");
        minusButton.setBounds(330, 330, 80, 80);
        jf.add(minusButton);

        JButton plusButton = new JButton("+");
        plusButton.setBounds(330, 430, 80, 80);
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

}