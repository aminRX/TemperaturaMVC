/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.aminrx.student.java.util;


/**
 *
 * @author aminRX
 */
public abstract class Model extends Observable{
    protected Model(){
        super();
    }
    public void service(){
        advise();
    }
}
