/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.aminrx.controllers;

import me.aminrx.model.SettingModel;
import me.aminrx.util.Controller;
import me.aminrx.util.Model;
import me.aminrx.util.View;

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
