/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carascruces;

/**
 *
 * @author UTN
 */
public class Juego {
    Dado da;
    Jugador yo;
    Jugador yo2;
    private int turno = 2;

    public Juego() {
        this(new Dado());
    }

    public Juego(Dado dado) {
        da = java.util.Objects.requireNonNull(dado);
        yo = new Jugador();
        yo2 = new Jugador();
    }


    public void setTurno(int turnos) {
        if (turnos != 1 && turnos != 2) throw new IllegalArgumentException("El turno debe ser 1 o 2.");
        this.turno = turnos;
    }

    public Jugador getYo2() {
        return yo2;
    }

    public void setYo2(Jugador yo2) {
        this.yo2 = yo2;
    }

    public Jugador getYo() {
        return yo;
    }

    public void setYo(Jugador yo) {
        this.yo = yo;
    }
    public int cambiaTurno(){
        if(this.turno==1){
            this.turno=2;
        }
        else{
            if(this.turno==2){
                this.turno=1;
            }
        }
        return this.turno;
    }

    public String turno() {
        cambiaTurno();
        Jugador jugador = turno == 1 ? yo : yo2;
        int dado = da.generaAleatorio();
        if (dado == 1 || dado == 2) jugador.setPosicion(dado);
        String movimiento = dado <= 2 ? "Avanza " + dado : "No se puede mover por sacar " + dado;
        return "Turno de " + jugador.getNombreJugador() + ": " + movimiento
            + "\n" + yo.toString1() + "\n" + yo2.toString1();
    }
}