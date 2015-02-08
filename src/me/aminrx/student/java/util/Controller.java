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
    public abstract void initialize(Model model, View view);
    public abstract void handleEvent();
}
