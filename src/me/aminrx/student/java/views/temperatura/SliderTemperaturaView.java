/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.aminrx.student.java.views.temperatura;

import me.aminrx.student.java.controllers.temperatura.SliderTemperaturaController;
import me.aminrx.student.java.model.BasicModel;
import me.aminrx.student.java.util.Controller;
import me.aminrx.student.java.util.Model;
import me.aminrx.student.java.util.View;

/**
 *
 * @author aminRX
 */
public class SliderTemperaturaView extends View {
    private Model model;
    private SliderTemperaturaController controller;

    @Override
    public void initialize(Model model) {
        this.model = model;
        model.attach(this);
        makeController();
        this.controller.initialize(model, this);
    }

    @Override
    public void makeController() {
        this.controller = new SliderTemperaturaController();
    }

    @Override
    public void activated() {
        
    }

    public void display() {
        
    }
    public SliderTemperaturaController getController(){
        return this.controller;
    }
    
    @Override
    public void update() {
        BasicModel basicModel = (BasicModel)model;
        int a = (int)basicModel.getCelsius();
        this.controller.getJSlider().setValue(a);
    }
    
}
