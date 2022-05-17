package ViewModel;

import Model.Discrimenant;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ViewMath{

    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton calculateButton;
    private JButton eraseButton;
    private JButton quitButton;
    private JTextField textField4;
    private JTextField textField5;
    private Discrimenant _podshet;

    public ViewMath()
    {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isDigit(textField1.getText(), textField2.getText(), textField3.getText()))
                {
                    _podshet = new Discrimenant(Integer.parseInt(textField1.getText()), Integer.parseInt(textField2.getText()), Integer.parseInt(textField3.getText()));
                    if(_podshet.get_dscr() >= 0){
                        textField4.setText(Integer.toString((int)_podshet.Root1()));
                        textField5.setText(Integer.toString((int)_podshet.Root2()));
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Discriminant < 0");
                }
                else
                    JOptionPane.showMessageDialog(null, "textbox empty");
            }
        });
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });
        eraseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
                textField5.setText("");
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("View");
        frame.setContentPane(new ViewMath().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private static boolean isDigit(String txt1, String txt2, String txt3){
        try {
            Integer.parseInt(txt1);
            Integer.parseInt(txt2);
            Integer.parseInt(txt3);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
