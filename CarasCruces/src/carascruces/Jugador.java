/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carascruces;

/**
 *
 * @author UTN
 */
public class Jugador {
    private int posicion;
    private String nombreJugador;
    public Jugador(){
    }
    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

   

    public void setPosicion(int posicion) {
        this.posicion = this.posicion + posicion;
    }

    
    
    public String getNombreJugador() {
        return nombreJugador;
    }

   

    public int getPosicion() {
        return posicion;
    }

   
    public String toString1(){
        return "El jugador "+ this.nombreJugador+'\n'+"Se encuentra en la posicion "+this.posicion;
    }
    
}
