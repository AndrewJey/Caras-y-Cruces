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
        int siguiente;
        
        Juego j = new Juego();
        j.getYo().setNombreJugador(JOptionPane.showInputDialog("Digite el nombre del jugador 1"));
        j.getYo2().setNombreJugador(JOptionPane.showInputDialog("Digite el nombre del jugador 2"));
        do{
        JOptionPane.showMessageDialog(null, j.turno());
        siguiente= Integer.parseInt(JOptionPane.showInputDialog("¿Desea ir al siguiente turno? Digite 1 para si, 0 para no"));
        }while(siguiente==1);
    }
}
