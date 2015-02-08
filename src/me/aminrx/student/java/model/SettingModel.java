package me.aminrx.student.java.model;

import me.aminrx.student.java.util.Model;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aminRX
 */
public class SettingModel extends Model {
    private float farenheit;
    private float kelvin;
    
    public SettingModel() {
        super();
    }
    
    public float getKelvin() {
        return kelvin;
    }
    
    public float getFahrenheit() {
        return farenheit;
    }
    
    public void setCelsiusToKelvin(int celsius) {
        kelvin = (float)(celsius + 273.15);
    }
    public void setCelsiusToFahrenheit(int celsius) {
        farenheit =  (float)(1.8 * celsius + 32);
    }
}
