/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carascruces;

/**
 *
 * @author UTN
 */
public class Dado {
    private int random;
    public Dado(){
    }
    public int generaAleatorio() {
        return this.random = (int) (Math.random() * 6) + 1;
    }
    
}
