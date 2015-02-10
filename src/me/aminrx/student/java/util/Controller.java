/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.aminrx.student.java.util;

import javax.swing.JFrame;


/**
 *
 * @author aminRX
 */
public abstract class Controller  extends JFrame implements Observer{
    
    protected Model model;
    protected View view;
    
    public void initialize(Model model, View view) {
        model.attach(this);
        this.model = model;
        this.view = view;
    }
    public void handleEvent() {
        model.service();
    }
}
