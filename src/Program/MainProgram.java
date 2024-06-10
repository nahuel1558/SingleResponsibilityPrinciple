package Program;

import View.ViewMain;

/**
 *
 * @author nahue
 */
public class MainProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Intance.instancing();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ViewMain().setVisible(true);
            }
        });
    }
}

