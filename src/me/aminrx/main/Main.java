/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.aminrx.main;
import me.aminrx.model.SettingModel;
import me.aminrx.util.Model;
import me.aminrx.views.SettingView;

/**
 *
 * @author aminRX
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Model model = new SettingModel();
        SettingView view = new SettingView();
        view.initialize(model);
        view.setVisible(true);
    }
}
