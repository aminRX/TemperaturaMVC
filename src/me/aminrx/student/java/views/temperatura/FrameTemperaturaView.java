/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.aminrx.student.java.views.temperatura;

import javax.swing.JSlider;
import javax.swing.JTextField;
import me.aminrx.student.java.util.Model;
import me.aminrx.student.java.util.View;
import me.aminrx.student.java.controllers.temperatura.*;
import me.aminrx.student.java.views.temperatura.*;

/**
 *
 * @author aminRX
 */
public class FrameTemperaturaView extends View {
    private Model model;
    private FrameTemperaturaController controller;
    private JSlider sldTemperatura;
    private JTextField txtCelsius;
    private JTextField txtFahrenheit;
    private JTextField txtKelvin;
    
    private javax.swing.JLabel lblCelsius;
    private javax.swing.JLabel lblFahrenheit;
    private javax.swing.JLabel lblKelvin;
    public FrameTemperaturaView(){

        
    }
    @Override
    public void initialize(Model model) {
        this.model = model;
        model.attach(this);
        makeController();
        this.controller.initialize(model, this);
        lblCelsius = new javax.swing.JLabel();
        lblFahrenheit = new javax.swing.JLabel();
        lblKelvin = new javax.swing.JLabel();
        lblCelsius.setText("Celsius");
        lblFahrenheit.setText("Fahrenheit");
        lblKelvin.setText("Kelvin");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        //inicializar el slider
        SliderTemperaturaView sliderTemperaturaView = new SliderTemperaturaView();
        sliderTemperaturaView.initialize(model);
        SliderTemperaturaController sliderTemperaturaController = sliderTemperaturaView.getController();
        //      agregar el slider al frame
         sldTemperatura = sliderTemperaturaController.getJSlider();
        
        
        
        
        //inicializar el textfield celsius 
        TextFieldCelsiusView textFieldCelsiusView = new TextFieldCelsiusView();
        textFieldCelsiusView.initialize(model);
        TextFieldCelsiusController textFieldCelsiusController = textFieldCelsiusView.getController();
        //     agregar el textfield de celsius
        txtCelsius = textFieldCelsiusController.getTextField();
        
        
        
        
        //inicializar el textfield farenheit
        TextFieldFahrenheitView textFieldFahrenehitView = new TextFieldFahrenheitView();
        textFieldFahrenehitView.initialize(model);
        TextFieldFahrenheitController textFieldFahrenheitController = textFieldFahrenehitView.getController();
        //     agregar el textfield de farenheit
        txtFahrenheit = textFieldFahrenheitController.getTextField();
        
        
        
        
        //inicializar el textfield kelvin
        TextFieldKelvinView textFieldKelvinView = new TextFieldKelvinView();
        textFieldKelvinView.initialize(model);
        TextFieldKelvinController textFieldKelvinController = textFieldKelvinView.getController();
        //     agregar el textfield de kelvin
        txtKelvin = textFieldKelvinController.getTextField();
        
        
        

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(21, 21, 21)
                .add(sldTemperatura, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 121, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblCelsius)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                        .add(lblFahrenheit)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(lblKelvin)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                .add(txtCelsius, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                .add(txtFahrenheit)
                                .add(txtKelvin)))))
                .add(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(8, 8, 8)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createSequentialGroup()
                        .add(lblCelsius, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(txtCelsius, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(sldTemperatura, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lblFahrenheit)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(txtFahrenheit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lblKelvin)
                .add(2, 2, 2)
                .add(txtKelvin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();  
        
    }

    @Override
    public void makeController() {
        this.controller = new FrameTemperaturaController();
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
    }
     public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrameTemperaturaView().setVisible(true);
            }
        });
     }
    
}
