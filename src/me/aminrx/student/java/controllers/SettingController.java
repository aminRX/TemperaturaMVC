/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.aminrx.student.java.controllers;

import me.aminrx.student.java.model.SettingModel;
import me.aminrx.student.java.util.Controller;
import me.aminrx.student.java.util.Model;
import me.aminrx.student.java.util.View;

/**
 *
 * @author aminRX
 */
public class SettingController extends Controller {
    private Model model;
    private View view;
    
    @Override
    public void initialize(Model model, View view) {
        model.attach(this);
        this.model = model;
        this.view = view;
    }
    
    @Override
    public void handleEvent() {
        model.service();
    }
    
    @Override
    public void update() {
       SettingModel settingModel = (SettingModel)model;
       System.out.println("La conversion es: "+ settingModel.getFahrenheit() + " y " + settingModel.getKelvin());
    }
}
