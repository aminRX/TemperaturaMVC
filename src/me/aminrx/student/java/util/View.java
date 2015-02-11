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
public abstract class View extends JFrame implements Observer{
    public abstract void initialize(Model model); 
    public abstract void makeController();
    public abstract void activated();
    public abstract void display();
}
