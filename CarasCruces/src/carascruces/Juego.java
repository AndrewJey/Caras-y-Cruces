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
    private int turno;

    public Juego() {
        da = new Dado();
        yo = new Jugador();
        yo2 = new Jugador();
    }


    public void setTurno(int turnos) {
        turnos=2;
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
        if(this.turno==0){
            this.setTurno(turno);
        }
        this.cambiaTurno();
     
            if (this.turno == 1) {
                int dado = da.generaAleatorio();
                switch (dado) {
                    case 1:
                        yo.setPosicion(dado);
                        break;
                    case 2:
                        yo.setPosicion(dado);
                        break;
                    case 3:
                        return "No se puede mover por sacar " + dado;
                    case 4:
                        return "No se puede mover por sacar " + dado;
                    case 5:
                        return "No se puede mover por sacar " + dado;
                    case 6:
                        return "No se puede mover por sacar " + dado;
                    default:
                        return "No se puede mover por sacar " + dado;
                }

            }
            
            if (this.turno == 2) {
                int dado = da.generaAleatorio();
                switch (dado) {
                    case 1:
                        yo2.setPosicion(dado);
                        break;
                    case 2:
                        yo2.setPosicion(dado);
                        break;
                    case 3:
                        return "No se puede mover por sacar " + dado;
                    case 4:
                        return "No se puede mover por sacar " + dado;
                    case 5:
                        return "No se puede mover por sacar " + dado;
                    case 6:
                        return "No se puede mover por sacar " + dado;
                    default:
                        return "No se puede mover por sacar " + dado;
                }

            }
      
            
            return "Jugador uno "+ yo.toString1()+" Jugador 2 "+ yo2.toString1();
    }
}