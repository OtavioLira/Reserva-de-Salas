package main;

import View.SplashScreen_GUI;
import java.awt.SplashScreen;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        new SplashScreen_GUI().setVisible(true);
        Controller.DriverConection.DriverLoader();
    }
    
}
