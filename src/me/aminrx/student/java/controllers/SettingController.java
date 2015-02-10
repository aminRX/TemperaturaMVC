/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.aminrx.student.java.controllers;

import me.aminrx.student.java.model.SettingModel;
import me.aminrx.student.java.util.Controller;

/**
 *
 * @author aminRX
 */
public class SettingController extends Controller {
    @Override
    public void update() {
       SettingModel settingModel = (SettingModel)super.model;
       System.out.println("La conversion es: "+ settingModel.getFahrenheit() + " y " + settingModel.getKelvin());
    }
}
