/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.aminrx.student.java.util;


/**
 *
 * @author aminRX
 */
public abstract class Controller implements Observer{
    
    protected Model model;
    protected View view;
    
    public void initialize(Model model, View view) {
        model.attach(this);
        this.model = model;
        this.view = view;
        this.initializeInput();
    }
    public void handleEvent() {
        model.service();
    }
    public abstract void initializeInput();
}
