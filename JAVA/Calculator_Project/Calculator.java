
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
    // booleal true or false only
    boolean isoperatorclicked = false;
    String oldValue;
    String labelText;
    String Opereration;
    JFrame jf;
    static double a = 0, b = 0, result = 0;
    static int operator = 0;
    JLabel displayLabel;
    JButton sevenButton;
    JButton eightButton;
    JButton plusButton;
    JButton minusButton;
    JButton mulButton;
    JButton divButton;
    JButton equalButton;
    JButton zeroButton;
    JButton dotButton;
    JButton threthButton;
    JButton towButton;
    JButton oneButton;
    JButton sixthButton;
    JButton fourButton;
    JButton fiveButton;
    JButton ninethButton;
    JButton clear;

    // Create c constructor for calculator
    public Calculator() {
        // Create a object for Jfreame
        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(300, 150);
        // create object for JLabel class
        displayLabel = new JLabel("");

        // Create disply window
        displayLabel.setBounds(30, 50, 450, 40);
        jf.setVisible(true);
        jf.add(displayLabel);
        // create buttons

        sevenButton = new JButton("7");
        sevenButton.setBounds(30, 130, 80, 80);
        sevenButton.addActionListener(this);
        sevenButton.setFont(new Font("Arial", Font.BOLD, 40));
        jf.add(sevenButton);

        eightButton = new JButton("8");
        eightButton.setBounds(130, 130, 80, 80);
        eightButton.addActionListener(this);
        eightButton.setFont(new Font("Arial", Font.BOLD, 40));
        jf.add(eightButton);

        ninethButton = new JButton("9");
        ninethButton.setBounds(230, 130, 80, 80);
        ninethButton.addActionListener(this);
        ninethButton.setFont(new Font("Arial", Font.BOLD, 40));
        jf.add(ninethButton);

        fourButton = new JButton("4");
        fourButton.setBounds(30, 230, 80, 80);
        fourButton.addActionListener(this);
        fourButton.setFont(new Font("Arial", Font.BOLD, 40));
        jf.add(fourButton);

        fiveButton = new JButton("5");
        fiveButton.setBounds(130, 230, 80, 80);
        fiveButton.addActionListener(this);
        fiveButton.setFont(new Font("Arial", Font.BOLD, 40));
        jf.add(fiveButton);

        sixthButton = new JButton("6");
        sixthButton.setBounds(230, 230, 80, 80);
        sixthButton.addActionListener(this);
        sixthButton.setFont(new Font("Arial", Font.BOLD, 40));
        jf.add(sixthButton);

        oneButton = new JButton("1");
        oneButton.setBounds(30, 330, 80, 80);
        oneButton.addActionListener(this);
        oneButton.setFont(new Font("Arial", Font.BOLD, 40));
        jf.add(oneButton);

        towButton = new JButton("2");
        towButton.setBounds(130, 330, 80, 80);
        towButton.addActionListener(this);
        towButton.setFont(new Font("Arial", Font.BOLD, 40));
        jf.add(towButton);

        threthButton = new JButton("3");
        threthButton.setBounds(230, 330, 80, 80);
        threthButton.addActionListener(this);
        threthButton.setFont(new Font("Arial", Font.BOLD, 40));
        jf.add(threthButton);

        dotButton = new JButton(".");
        dotButton.setBounds(30, 430, 80, 80);
        dotButton.addActionListener(this);
        dotButton.setFont(new Font("Arial", Font.BOLD, 40));
        jf.add(dotButton);

        zeroButton = new JButton("0");
        zeroButton.setBounds(130, 430, 80, 80);
        zeroButton.addActionListener(this);
        zeroButton.setFont(new Font("Arial", Font.BOLD, 40));
        jf.add(zeroButton);

        equalButton = new JButton("=");
        equalButton.setBounds(230, 430, 80, 80);
        equalButton.addActionListener(this);
        equalButton.setFont(new Font("Arial", Font.BOLD, 40));
        jf.add(equalButton);

        divButton = new JButton("/");
        divButton.setBounds(330, 130, 80, 80);
        divButton.addActionListener(this);
        divButton.setFont(new Font("Arial", Font.BOLD, 40));
        jf.add(divButton);

        mulButton = new JButton("x");
        mulButton.setBounds(330, 230, 80, 80);
        mulButton.addActionListener(this);
        mulButton.setFont(new Font("Arial", Font.BOLD, 40));
        jf.add(mulButton);

        minusButton = new JButton("-");
        minusButton.setBounds(330, 330, 80, 80);
        minusButton.addActionListener(this);
        minusButton.setFont(new Font("Arial", Font.BOLD, 40));
        jf.add(minusButton);

        clear = new JButton("clr");
        clear.setBounds(430, 430, 80, 80);
        clear.addActionListener(this);
        clear.setFont(new Font("Arial", Font.BOLD, 40));
        jf.add(clear);

        plusButton = new JButton("+");
        plusButton.setBounds(330, 430, 80, 80);
        plusButton.addActionListener(this);
        plusButton.setFont(new Font("Arial", Font.BOLD, 40));
        jf.add(plusButton);

        displayLabel.setBackground(Color.GRAY);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.WHITE);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == sevenButton)
            displayLabel.setText(displayLabel.getText().concat("7"));
        if (e.getSource() == eightButton)
            displayLabel.setText(displayLabel.getText().concat("8"));
        if (e.getSource() == ninethButton)
            displayLabel.setText(displayLabel.getText().concat("9"));
        if (e.getSource() == fiveButton)
            displayLabel.setText(displayLabel.getText().concat("5"));
        if (e.getSource() == fourButton)
            displayLabel.setText(displayLabel.getText().concat("4"));
        if (e.getSource() == threthButton)
            displayLabel.setText(displayLabel.getText().concat("3"));
        if (e.getSource() == towButton)
            displayLabel.setText(displayLabel.getText().concat("2"));
        if (e.getSource() == oneButton)
            displayLabel.setText(displayLabel.getText().concat("1"));
        if (e.getSource() == zeroButton)
            displayLabel.setText(displayLabel.getText().concat("0"));
        if (e.getSource() == dotButton)
            displayLabel.setText(displayLabel.getText().concat("."));

        if (e.getSource() == plusButton) {
            a = Double.parseDouble(displayLabel.getText());
            operator = 1;
            displayLabel.setText("");
        }
        if (e.getSource() == minusButton) {
            a = Double.parseDouble(displayLabel.getText());
            operator = 2;
            displayLabel.setText("");
        }
        if (e.getSource() == divButton) {
            a = Double.parseDouble(displayLabel.getText());
            operator = 3;
            displayLabel.setText("");
        }
        if (e.getSource() == mulButton) {
            a = Double.parseDouble(displayLabel.getText());
            operator = 4;
            displayLabel.setText("");
        }

        if (e.getSource() == equalButton) {
            b = Double.parseDouble(displayLabel.getText());
            switch (operator) {
                case 1:
                    result = a + b;
                    break;
                case 2:
                    result = a - b;
                    break;
                case 3:
                    result = a / b;
                    break;
                case 4:
                    result = a * b;
                    break;
                default:
                    result = 0;
            }
            displayLabel.setText("" + result);
        }
        if (e.getSource() == clear) {

            displayLabel.setText("");
        }
    }

    public static void main(String[] args) {
        // Create a object for calculator
        Calculator p = new Calculator();

    }

    ////////
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
