/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.aminrx.student.java.controllers.temperatura;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import me.aminrx.student.java.model.BasicModel;
import me.aminrx.student.java.util.Controller;

/**
 *
 * @author aminRX
 */
public class TextFieldFahrenheitController extends Controller implements ActionListener{

    private JTextField textField;

    @Override
    public void initializeInput() {
        textField = new JTextField();
        textField.addActionListener(this);
    }

    @Override
    public void update() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        BasicModel basicModel = (BasicModel)model;
//        basicModel.setCelsius(Float.parseFloat(textField.getText()));
//        handleEvent();
    }
    public JTextField getTextField(){
        return textField;
    }
}
