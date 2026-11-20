/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carascruces;

import javax.swing.JOptionPane;

/**
 *
 * @author UTN
 */
public class CarasCruces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juego juego = new Juego();
        String primero = JOptionPane.showInputDialog("Nombre del jugador 1 (Cancelar para salir)");
        if (primero == null) return;
        String segundo = JOptionPane.showInputDialog("Nombre del jugador 2 (Cancelar para salir)");
        if (segundo == null) return;
        juego.getYo().setNombreJugador(primero.trim().isEmpty() ? "Jugador 1" : primero.trim());
        juego.getYo2().setNombreJugador(segundo.trim().isEmpty() ? "Jugador 2" : segundo.trim());
        do {
            JOptionPane.showMessageDialog(null, juego.turno(), "Caras y cruces", JOptionPane.INFORMATION_MESSAGE);
        } while (JOptionPane.showConfirmDialog(null, "¿Jugar el siguiente turno?", "Continuar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
    }
}
