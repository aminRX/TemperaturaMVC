/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.aminrx.student.java.views.temperatura;

import me.aminrx.student.java.controllers.temperatura.TextFieldCelsiusController;
import me.aminrx.student.java.controllers.temperatura.TextFieldFahrenheitController;
import me.aminrx.student.java.model.BasicModel;
import me.aminrx.student.java.util.Model;
import me.aminrx.student.java.util.View;

/**
 *
 * @author aminRX
 */
public class TextFieldFahrenheitView extends View {
    private Model model;
    private TextFieldFahrenheitController controller;

    @Override
    public void initialize(Model model) {
        this.model = model;
        model.attach(this);
        makeController();
        this.controller.initialize(model, this);
    }

    @Override
    public void makeController() {
        this.controller = new TextFieldFahrenheitController();
    }

    @Override
    public void activated() {

    }

    @Override
    public void display() {

    }

    @Override
    public void update() {
         BasicModel basicModel = (BasicModel)model;
         this.controller.getTextField().setText(Float.toString(basicModel.getFahrenheit()));
    }
    
    public TextFieldFahrenheitController getController(){
        return this.controller;
    }
    
}
