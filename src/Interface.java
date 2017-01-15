import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ashkanmehrkar on 4/24/16.
 */
public class Interface {
    private JFrame frame;
    private JPanel panel1;
    private JPanel panel2;
    private JButton but1;
    private JButton but2;
    private JButton but3;
    private JButton but4;
    private JButton but5;
    private JButton but6;
    private JButton but7;
    private JButton but8;
    private JButton but9;
    private JButton but10;
    private JButton but11;
    private JButton but12;
    private JButton but13;
    private JButton but14;
    private JButton but15;
    private JButton but16;
    private JButton but17;
    private JTextField textField;
    private ActionListener action;
    private String num1;
    private String num2;
    protected String function;
    protected char operand;

    public void functionReader(String s) {
        char tmp;
        int index = 0;
        for(int i = 0; i < s.length(); i++) {
            tmp = s.charAt(i);
            if(tmp == '+' || tmp == '-' || tmp == 'x' || tmp == '/') {
                if(i != 0) {
                    index = i;
                    break;
                }
            }
        }
        num1 = s.substring(0 , index);
        operand = s.charAt(index);
        num2 = s.substring(index+1 , s.length());
        double number1 = Double.parseDouble(num1);
        double number2 = Double.parseDouble(num2);
        double result;
        if(operand == '+')
            result = number1 + number2;
        else if(operand == '-')
            result = number1 - number2;
        else if(operand == 'x')
            result = number1 * number2;
        else
            result = number1 / number2;
        function = "" + result;
        textField.setText(function);
    }

    public Interface() {
        function = "";
        action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == but1)
                    function = function.concat("7");
                if (e.getSource() == but2)
                    function = function.concat("8");
                if (e.getSource() == but3)
                    function = function.concat("9");
                if (e.getSource() == but4)
                    function = function.concat("/");
                if (e.getSource() == but5)
                    function = function.concat("4");
                if (e.getSource() == but6)
                    function = function.concat("5");
                if (e.getSource() == but7)
                    function = function.concat("6");
                if (e.getSource() == but8)
                    function = function.concat("x");
                if (e.getSource() == but9)
                    function = function.concat("1");
                if (e.getSource() == but10)
                    function = function.concat("2");
                if (e.getSource() == but11)
                    function = function.concat("3");
                if (e.getSource() == but13)
                    function = function.concat("0");
                if (e.getSource() == but12)
                    function = function.concat("-");
                if (e.getSource() == but14)
                    function = function.concat(".");
                if(e.getSource() == but15)
                    functionReader(function);
                if (e.getSource() == but16)
                    function = function.concat("+");
                if(e.getSource() == but17)
                    function = "";
                textField.setText(function);
            }

        };
        frame = new JFrame("My Calculator");
        frame.setSize(new Dimension(300 , 300));
        frame.setLayout(new BorderLayout());

        panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());

        textField = new JTextField();
        textField.setEditable(false);
        textField.setFont(new Font("Times New Roman",0,20));
        textField.setText(function);
        but17 = new JButton("AC");
        but17.addActionListener(action);
        panel1.add(textField, BorderLayout.CENTER);
        panel1.add(but17, BorderLayout.EAST);

        panel2 = new JPanel(new GridLayout(4,4));
        but1 = new JButton("7");
        but1.addActionListener(action);
        but2 = new JButton("8");
        but2.addActionListener(action);
        but3 = new JButton("9");
        but3.addActionListener(action);
        but4 = new JButton("/");
        but4.addActionListener(action);
        but5 = new JButton("4");
        but5.addActionListener(action);
        but6 = new JButton("5");
        but6.addActionListener(action);
        but7 = new JButton("6");
        but7.addActionListener(action);
        but8 = new JButton("x");
        but8.addActionListener(action);
        but9 = new JButton("1");
        but9.addActionListener(action);
        but10 = new JButton("2");
        but10.addActionListener(action);
        but11 = new JButton("3");
        but11.addActionListener(action);
        but12 = new JButton("-");
        but12.addActionListener(action);
        but13 = new JButton("0");
        but13.addActionListener(action);
        but14 = new JButton(".");
        but14.addActionListener(action);
        but15 = new JButton("=");
        but15.addActionListener(action);
        but16 = new JButton("+");
        but16.addActionListener(action);
        panel2.add(but1);
        panel2.add(but2);
        panel2.add(but3);
        panel2.add(but4);
        panel2.add(but5);
        panel2.add(but6);
        panel2.add(but7);
        panel2.add(but8);
        panel2.add(but9);
        panel2.add(but10);
        panel2.add(but11);
        panel2.add(but12);
        panel2.add(but13);
        panel2.add(but14);
        panel2.add(but15);
        panel2.add(but16);

        frame.add(panel2, BorderLayout.CENTER);
        frame.add(panel1, BorderLayout.NORTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

        Interface cal1 = new Interface();
    }
}
