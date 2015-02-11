/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.aminrx.student.java.views.temperatura;

import me.aminrx.student.java.controllers.temperatura.TextFieldKelvinController;
import me.aminrx.student.java.model.BasicModel;
import me.aminrx.student.java.util.Model;
import me.aminrx.student.java.util.View;

/**
 *
 * @author aminRX
 */
public class TextFieldKelvinView extends View {
    private Model model;
    private TextFieldKelvinController controller;
    @Override
    public void initialize(Model model) {
        this.model = model;
        model.attach(this);
        makeController();
        this.controller.initialize(model, this);
    }

    @Override
    public void makeController() {
        this.controller = new TextFieldKelvinController();
    }

    @Override
    public void activated() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void display() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update() {
        BasicModel basicModel = (BasicModel)model;
        this.controller.getTextField().setText(Float.toString(basicModel.getKelvin()));
    }
    
    public TextFieldKelvinController getController(){
        return this.controller;
    }
    
}
