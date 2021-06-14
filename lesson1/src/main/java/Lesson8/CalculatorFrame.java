package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CalculatorFrame extends JFrame {
    private JTextField inputArea;
    public CalculatorFrame() {
        setTitle("Calculator v1.0");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setBounds(100,100,300,400);

        setJMenuBar(createMenuBar());

        setLayout(new BorderLayout());

        add(createTopPanel(), BorderLayout.NORTH);

        add(createClearPanel(),BorderLayout.SOUTH);

        add(createButtonPanel(), BorderLayout.CENTER);

        setVisible(true);

    }
    private JPanel createTopPanel () {
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());

        inputArea = new JTextField();
        inputArea.setEditable(false);
        top.add(inputArea, BorderLayout.CENTER);
        return top;
    }
    private JPanel createClearPanel() {
        JPanel clearePanel = new JPanel();
        clearePanel.setLayout(new BorderLayout());
        JButton clearButton = new JButton("C");
        clearButton.addActionListener(e -> inputArea.setText(""));
        clearePanel.add(clearButton);
        return clearePanel;
    }

    private JPanel createButtonPanel() {
        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(5,3));

        DigitButtonActionListener digitButtonActionListener = new DigitButtonActionListener(inputArea);

        for (int i = 0; i <10 ; i++) {
            JButton but = new JButton(String.valueOf(i));
            but.addActionListener(digitButtonActionListener);
            bottom.add(but);
        }

        JButton plus = new JButton("+");
        plus.addActionListener(e->inputArea.setText(inputArea.getText() + "+"));
        bottom.add(plus);

        JButton minus = new JButton("-");
        minus.addActionListener(e->inputArea.setText(inputArea.getText() + "-"));
        bottom.add(minus);

        JButton increase = new JButton("*");
        increase.addActionListener(e->inputArea.setText(inputArea.getText() + "*"));
        bottom.add(increase);

        JButton divide = new JButton("/");
        divide.addActionListener(e->inputArea.setText(inputArea.getText() + "/"));
        bottom.add(divide);

        JButton calc = new JButton("=");
        calc.addActionListener(new CalcButtonActionListener(inputArea));
        bottom.add(calc);

        JButton sqrt = new JButton("√");
        sqrt.addActionListener(e->inputArea.setText(inputArea.getText() + "√"));
        bottom.add(sqrt);



        return bottom;
    }

    private JMenuBar createMenuBar () {

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        JMenuItem openItem = new JMenuItem("Open");
        fileMenu.add(openItem);

        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);



        return menuBar;
    }

}
