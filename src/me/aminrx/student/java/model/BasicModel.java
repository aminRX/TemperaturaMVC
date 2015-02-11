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
public class BasicModel extends Model {
    private float farenheit;
    private float kelvin;
    private float celsius;
    
    public BasicModel() {
        super();
    }
    
    public float getCelsius() {
        return celsius;
    }
    public float getKelvin() {
        return kelvin;
    }
    
    public float getFahrenheit() {
        return farenheit;
    }
    public void setCelsius(float celsius) {
        this.celsius = celsius;
        setCelsiusToFahrenheit(celsius);
        setCelsiusToKelvin(celsius);
    }
    private void setCelsiusToKelvin(float celsius) {
        kelvin = (float)(celsius + 273.15);
    }
    private void setCelsiusToFahrenheit(float celsius) {
        farenheit =  (float)(1.8 * celsius + 32);
    }
}
