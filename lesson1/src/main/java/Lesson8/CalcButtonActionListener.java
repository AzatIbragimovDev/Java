package Lesson8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CalcButtonActionListener implements ActionListener {
    private final JTextField textField;

    public CalcButtonActionListener(JTextField textField) {
        this.textField = textField;
    }


    public void actionPerformed(ActionEvent e) {
        String input = textField.getText();
        char[] inputs = input.toCharArray();
        int i;
        int sum = 0;
        for (i = 0; i < inputs.length; i++) {
            if (inputs[i] == '+') {
                String[] operands = textField.getText().split("\\+");

                for (i = 0; i < operands.length; i++) {
                    sum += Integer.parseInt(operands[i]);
                }
            } else if (inputs[i] == '-') {
                String[] operands = textField.getText().split("-");
                for (i = 0; i < operands.length; i++) {
                    if (i == 0) {
                        sum += Integer.parseInt(operands[i]);
                    } else {
                        sum -= Integer.parseInt(operands[i]);
                    }
                }
            } else if (inputs[i] == '*') {
                String[] operands = textField.getText().split("\\*");
                for (i = 0; i < operands.length; i++) {
                    if(i == 0) {
                        sum += Integer.parseInt(operands[i]);
                    } else {
                    sum *= Integer.parseInt(operands[i]);
                    }
                } break;
            } else if (inputs[i] == '/') {
                String[] operands = textField.getText().split("/");
                for ( i = 0; i < operands.length; i++) {
                    if(i == 0) {
                        sum += Integer.parseInt(operands[i]);
                    } else {
                        sum /= Integer.parseInt(operands[i]);
                    }

                } break;
            } else if (inputs[i] == '√') {
                double sum1 = 0;
                String[] operands = textField.getText().split("√");
                for (i= 0;  i < operands.length; i++) {
                    sum1 = Math.sqrt(Integer.parseInt(operands[i]));

                }
                textField.setText(String.valueOf(sum1));
            }
        }
        textField.setText(String.valueOf(sum));
    }

}
