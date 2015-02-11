/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.aminrx.student.java.util;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author aminRX
 */
public abstract class Observable {
    private List<Observer> setOfObservers;
    
    protected Observable() {
        setOfObservers = new ArrayList();
    }
    public void attach(Observer o) {
        setOfObservers.add(o);
        System.out.println(o);
    }
    public void detach(Observer o) {
        setOfObservers.remove(o);
    }
    protected void advise(){
        for (Observer o: setOfObservers) {
            o.update();
        }
    }
}
