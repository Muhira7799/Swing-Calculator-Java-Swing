import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingCalculator extends JFrame implements ActionListener {

    JTextField num1, num2, result;
    JButton add, subtract, multiply, divide, modulus;

    SwingCalculator() {
        setTitle("Calculator");
        setLayout(new FlowLayout());

        add(new JLabel("First Number:"));
        num1 = new JTextField(10);
        add(num1);

        add(new JLabel("Second Number:"));
        num2 = new JTextField(10);
        add(num2);

        add = new JButton("Add");
        subtract = new JButton("Subtract");
        multiply = new JButton("Multiply");
        divide = new JButton("Divide");
        modulus = new JButton("Modulus");

        add(add);
        add(subtract);
        add(multiply);
        add(divide);
        add(modulus);

        add(new JLabel("Result:"));
        result = new JTextField(10);
        result.setEditable(false);
        add(result);

        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        modulus.addActionListener(this);

        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(num1.getText());
            double b = Double.parseDouble(num2.getText());
            double answer;

            if (e.getSource() == add) {
                answer = a + b;
            } else if (e.getSource() == subtract) {
                answer = a - b;
            } else if (e.getSource() == multiply) {
                answer = a * b;
            } else if (e.getSource() == divide) {
                if (b == 0) {
                    result.setText("Cannot divide by zero");
                    return;
                }
                answer = a / b;
            } else {
                if (b == 0) {
                    result.setText("Cannot divide by zero");
                    return;
                }
                answer = a % b;
            }

            result.setText(String.valueOf(answer));

        } catch (NumberFormatException ex) {
            result.setText("Enter valid numbers");
        }
    }

    public static void main(String[] args) {
        new SwingCalculator();
    }
}