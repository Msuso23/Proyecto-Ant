package Main;

import Interfaces.InterfaceFunctions;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * @author Cristian Gouveia
 * @author nicolepinto
 * @author Camila Garcia 
 */
public class ProyectoAnt {

    public static void main(String[] args) {
        updateAppareance();
        InterfaceFunctions.openBienvenida();
    }

    public static void updateAppareance() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
        }
    }
}
