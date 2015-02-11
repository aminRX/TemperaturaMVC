/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.aminrx.student.java.controllers.temperatura;

import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import me.aminrx.student.java.model.BasicModel;
import me.aminrx.student.java.util.Controller;

/**
 *
 * @author aminRX
 */
public class SliderTemperaturaController extends Controller implements ChangeListener{
    static final int FPS_MIN = 0;
    static final int FPS_MAX = 500;
    static final int FPS_INIT = 0;
    private JSlider sldTemperatura;
    private BasicModel settingModel;

    @Override
    public void initializeInput() {
        settingModel = (BasicModel)super.model;
        sldTemperatura = new JSlider(JSlider.HORIZONTAL,
                                      FPS_MIN, FPS_MAX, FPS_INIT);
        sldTemperatura.setMajorTickSpacing(100);
        sldTemperatura.setMinorTickSpacing(20);
        sldTemperatura.setPaintTicks(true);
        sldTemperatura.setPaintLabels(true);
        Font font = new Font("Serif", Font.ITALIC, 15);
        sldTemperatura.setFont(font);
        sldTemperatura.addChangeListener(this);
    }

    @Override
    public void update() {
        
    }
    
    @Override
    public void stateChanged(ChangeEvent e) {
        JSlider source = (JSlider)e.getSource();
        settingModel.setCelsius((int)source.getValue());
        handleEvent();
    }
    public JSlider getJSlider(){
        return sldTemperatura;
    }
}
