/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.aminrx.student.java.main;
import me.aminrx.student.java.model.BasicModel;
import me.aminrx.student.java.util.Model;
import me.aminrx.student.java.views.temperatura.FrameTemperaturaView;

/**
 *
 * @author aminRX
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Model model = new BasicModel();
        FrameTemperaturaView view = new FrameTemperaturaView();
        view.initialize(model);
        view.setVisible(true);
    }
}
