/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author amaan
 */
public class main_class {

    public static void main(String args[]) {
        SplashScreen screen = new SplashScreen();
        login sign = new login();
        screen.setVisible(true);
        try {
            for (int row = 0; row <= 100; row++) {
                Thread.sleep(40);
                screen.loadingnumber.setText(Integer.toString(row) + "%");
                screen.loadingprogress.setValue(row);
                if (row == 100) {
                    screen.setVisible(false);
                    sign.setVisible(true);
                }
            }
        } catch (Exception e) {
        }
    }
}
